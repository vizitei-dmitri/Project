package menu;

public class User {

    private String name;
    private String lastname;
    private int age;
    private String username;
    private String password;
    private int money;

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return this.username == user.username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public User(String name, String lastname, String age, String username, Integer password, Object money) {
        this.name = name;
        this.lastname = lastname;
        this.age = Integer.parseInt(age);
        this.username = username;
        this.password = String.valueOf(password);
        this.money = (int) money;
    }



}
