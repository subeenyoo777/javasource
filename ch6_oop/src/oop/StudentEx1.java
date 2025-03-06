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
        Student student4 = new Student("s0000000", "김영수", 1, 1, "010-5678-1234", "youngsu2@gmail.com");

        // 개발자 확인용.. 사용자한테는 쓸 수 없다.
        // System.out.println(student1);
        // System.out.println(student2);
        // System.out.println(student3);
        // System.out.println(student4);
        // 결과값
        // Student [stuId=null, name=null, grade=0, classNum=0, phone=null, email=null]
        // Student [stuId=null, name=null, grade=1, classNum=5, phone=null, email=null]
        // Student [stuId=s1234567, name=홍길동, grade=2, classNum=3, phone=010-1234-5678,
        // email=hong2@gmail.com]
        // Student [stuId=s0000000, name=김영수, grade=1, classNum=1, phone=010-5678-1234,
        // email=youngsu2@gmail.com]

        studentInfo(student3);
        System.out.println();

        studentInfo(student4);

        // 홍길동의 전화번호 변경
        student3.changeTel("010-5678-9535");
        System.out.println(student3);
    }

    // public static void.. 일단 메서드 만들 때 이렇게 하자.
    public static void studentInfo(Student student) {
        System.out.println("===================================================");
        System.out.println("아이디:" + student.getStuId());
        System.out.println("이름:" + student.getName());
        System.out.println("학년:" + student.getGrade());
        System.out.println("반:" + student.getClassNum());
        System.out.println("전화번호:" + student.getPhone());
        System.out.println("이메일:" + student.getEmail());
        System.out.println("===================================================");
    }

}
