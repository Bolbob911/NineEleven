package ITITIU25044_TrinhTranVinh_Lab04.Problem1;

public abstract class Member {
    private String id, name, email;

    public Member(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public abstract String getRole();
    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Email: " + email;
    }
}
