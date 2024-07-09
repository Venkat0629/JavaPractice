package practice;

class User {
    private int id;
    private String name;
    private String gender;

    public void setId(int id) throws Exception {
        if (id > 0 && id < 1000) this.id = id;
        else throw new Exception("Invalid User ID");
    }

    public void setName(String name) throws Exception {
        if (name != null && !name.isEmpty()) this.name = name;
        else throw new Exception("Invalid User Name");

    }

    public void setGender(String gender) throws Exception {
        if (gender != null && !gender.isEmpty() || gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Other"))
            this.gender = gender;
        else throw new Exception("Provided Gender type is Invalid");

    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", gender='" + gender + '\'' + '}';
    }
}

public class Encapsulation {
    public static void main(String[] args) throws Exception {
        User user = new User();
        user.setId(100);
        user.setGender("Venkat");
        user.setName("Male");
        System.out.println(user);

        User testUser = new User();
        testUser.setId(-100);
        testUser.setGender("");
        testUser.setName("");
        System.out.println(testUser);
    }


}
