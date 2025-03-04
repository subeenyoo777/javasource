package oop;

public class StudentEx1 {
    public static void main(String[] args) {
        // student 인스턴스 생성, 사용.
        // ※인스턴스를 생성 시 (new~)생성자를 사용함.
        // 학생 한 명당 객체를 만듦.
        // 초기화도 같이 한 것임.
        Student student1 = new Student();
        Student student2 = new Student(1, 5);
        Student student3 = new Student("s1234567", "홍길동", 2, 3, "010-1234-5678", "hong2@gmail.com");
        //

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // Student [stuId=null, name=null, grade=0, classNum=0, phone=null, email=null]
        // Student [stuId=null, name=null, grade=1, classNum=5, phone=null, email=null]
        // Student [stuId=s1234567, name=홍길동, grade=2, classNum=3, phone=010-1234-5678,
        // email=hong2@gmail.com]
    }
}
