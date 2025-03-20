package stream;

// import lombok.AllArgsConstructor;
// import lombok.Getter;

// @Getter
// @AllArgsConstructor

public class Student {
    private String name;
    private int math;

    public Student(String name, int math) {
        this.name = name;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getMath() {
        return math;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", math=" + math + "]";
    }

}
