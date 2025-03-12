package exception;

public class CheckedEx1 {

    public static void main(String[] args) {

        try {
            Class.forName(" ");

            // Class_NotFound_Exception
        } catch (ClassNotFoundException e) {

            // 개발자 기준 - 예외의 발생 원인 보기
            e.printStackTrace();
        }

    }
}

// [print stack] 어느 코드에서 오류가 발생했는지
// at java.base/java.lang.Class.forName0(Native Method)
// at java.base/java.lang.Class.forName(Class.java:375)
// at exception.CheckedEx1.main(CheckedEx1.java:8)
