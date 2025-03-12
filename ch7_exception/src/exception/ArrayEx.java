package exception;

public class ArrayEx {

    public static void main(String[] args) {

        int arr[] = new int[2];

        // try {
        // System.out.println(arr[0]); // Array_Index_Out_Of_Bounds_Exception
        // int num = 100 / 0; // Arithmetic_Exception

        // } catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println("배열 인덱스를 확인해 주세요");
        // } catch (ArithmeticException e) {
        // System.out.println("0으로 나눌 수 없습니다."); // 하고서 멈춘다
        // }

        // 크게, 두리뭉실하게 할 수도 있다.
        try {
            System.out.println(arr[0]); // Array_Index_Out_Of_Bounds_Exception
            int num = 100 / 0; // Arithmetic_Exception

        } catch (Exception e) {
            System.out.println("오류 발생.");
        }

        // (multi catch 구문) 에러를 or로 줄 수 있다.
        try {
            System.out.println(arr[0]); // Array_Index_Out_Of_Bounds_Exception
            int num = 100 / 0; // Arithmetic_Exception

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("오류 발생.");
        }

    }
}
