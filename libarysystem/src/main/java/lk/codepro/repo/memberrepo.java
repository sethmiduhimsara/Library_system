package lk.codepro.repo;

//save

import lk.codepro.library_system_entity.Member;
import lk.codepro.util.db_connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class memberrepo {

            public boolean saveMember(Member member) throws SQLException, ClassNotFoundException {


                Connection connection = db_connection.getInstance().getConnection();
                PreparedStatement ps = connection.prepareStatement("insert into member (id, name, address, email, contact) values (?,?,?,?,?)");

                    ps.setString(1, member.getId());
                    ps.setString(2, member.getName());
                    ps.setString(3, member.getAddress());
                    ps.setString(4, member.getEmail());
                    ps.setString(5, member.getContact());

                    int affectedRows =  ps.executeUpdate();

                    return  affectedRows > 0;


            }

            //delete


        public boolean delete(String id) throws SQLException, ClassNotFoundException {

                Connection connection = db_connection.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM member WHERE id = ?");
            ps.setString(1,id);
            int affectedRows = ps.executeUpdate();
            return  affectedRows > 0;

        }
}
