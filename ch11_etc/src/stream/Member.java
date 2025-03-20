package stream;

public class Member {

    public static int MALE = 0;
    public static int FEMALE = 0;

    private String name;
    private int gender;
    private int age;

    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}
