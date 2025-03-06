package oop;

public class MymathEx {
    public static void main(String[] args) {
        MyMath math = new MyMath();

        // 대표적인 오버로딩인 println으로 알아보자.

        // 1번 add(int a, int b)
        System.out.println(math.add(15, 25));

        // 2번 add(long a, int b)
        System.out.println(math.add(15L, 25));

        // 3번 add(int a, long b)
        System.out.println(math.add(15, 25L));

        // 4번 add (int a[])
        int arr[] = { 3, 4, 5 };
        System.out.println(math.add(arr));
    }
}
