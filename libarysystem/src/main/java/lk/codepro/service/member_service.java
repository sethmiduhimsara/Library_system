package lk.codepro.service;

import lk.codepro.dto.member_dto;
import lk.codepro.library_system_entity.Member;
import lk.codepro.repo.memberrepo;

import java.sql.SQLException;

public class member_service {
    private final memberrepo memberRepo = new memberrepo();
    private String id;

    public boolean addMember(member_dto member) {

        Member entity = this.convertdtotoentity(member);

        try {
            boolean issaved = memberRepo.saveMember(entity);
                return issaved;
        } catch (SQLException | ClassNotFoundException e) {
            return false;
        }



    }



    public boolean delete(String id){
        try {
            boolean delete = memberRepo.delete(String.valueOf(id));
            return delete;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }


    private Member convertdtotoentity(member_dto memberDto) {

        Member member = new Member();
        member.setId(memberDto.getId());
        member.setName(memberDto.getName());
        member.setEmail(memberDto.getAddress());
        member.setEmail(memberDto.getEmail());
        member.setEmail(memberDto.getContact());
        return member;


    }
}
