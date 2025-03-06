package oop;

// 생성자 : 개발자가 명시하지 않으면 컴파일러가 자동으로 default 생성자 만들어줌.
// 클래스명(){}
// student(){} // 기본 생성자.
public class Student {

    // 클래스 내 필수요소는 아님. (예: 속성).. 메소드만 있을 수도 있다.
    // 맴버 변수, 맴버 메소드, 생성자

    // 속성:
    // 학번(s1024125), 이름(홍길동), 학년(1), 반(1), 전화번호(010-1234-1234),이메일(hong2@gmail.com)
    String stuId;

    private String name;
    private int grade;
    private int classNum;
    private String phone;
    private String email;

    // default 생성자: 괄호 안 아무것도 없음
    public Student() {
    }

    public String getStuId() {
        return stuId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getClassNum() {
        return classNum;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // 생성자 목적(new~)
    // 생성자 오버로딩
    // : 맴버 변수 초기화
    public Student(String stuId, String name, int grade, int classNum, String phone, String email) {
        this.stuId = stuId;
        this.name = name;
        this.grade = grade;
        this.classNum = classNum;
        this.phone = phone;
        this.email = email;
        // this = 객체 자신..String name;/int grade...와 같음.
    }

    // int grade, int classNum - argument 지역변수(전달인자)
    public Student(int grade, int classNum) {
        this.grade = grade;
        this.classNum = classNum;
    }

    // 기능: 전화번호를 변경한다. 이메일을 변경한다. 학년을 변경한다. 반을 변경한다.
    // 메서드: 리턴타입 메서드명 () {}
    // 소문자로 시작.
    // 리턴(반환) 타입: 기본 타입(정수형, booloean, 문자형, 실수형), 객체(대문자로 시작)타입, 배열,
    // void(지님리턴 타입 없음)

    void changeTel(String phone) {
        // this: 맴버 변수 앞, 맴버 메서드 앞
        this.phone = phone;
    }

    void changeEmail(String email) {
        this.email = email;
    }

    void changeGrade(int grade) {
        this.grade = grade;
    }

    void changeClassNum(int classNUM) {
        this.classNum = classNUM;
    }

    // () 입력은 없으나
    /// 출력문 형태는 string 으로 내보내.
    @Override
    public String toString() {
        return "Student [stuId=" + stuId + ", name=" + name + ", grade=" + grade + ", classNum=" + classNum + ", phone="
                + phone + ", email=" + email + "]";
    }

}

// 생성자 constructor
// public String() {
// this.value = "".value;
// this.coder = "".coder;
// }

// char 반환(리턴)타입
// int 입력타입
// public char charAt(int index) {
// if (isLatin1()) {
// return StringLatin1.charAt(value, index);
// } else {
// return StringUTF16.charAt(value, index);
// }
// }
