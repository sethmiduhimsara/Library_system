package lk.codepro.library_system_entity;


public class Member {
    private String id;
    private String name;
    private String address;
    private String email;
    private String contact;

    public Member() {
    }

    public Member(String id, String name, String address, String email, String contact) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setEmail(email);
        this.setContact(contact);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}