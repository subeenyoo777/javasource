package condition;

import java.util.Scanner;

public class SwitchTest4 {

    public static void main(String[] args) {

        // 가위(1), 바위(2), 보(3) 게임

        // 컴퓨터가 내는 가위,바위,보 결정(무작위,랜덤)
        // 사용자가 내는 가위바위보 결정(입력)

        int computer = (int) ((Math.random() * 3)) + 1;

        // () 0~2까지만. +1해서 3이 나오도록.

        Scanner scanner = new Scanner(System.in);
        System.out.println("가위(1),바위(2),보(3) 중 하나 입력");
        String input = scanner.nextLine();
        int user = Integer.parseInt(input);

        // 컴퓨터가 이겼습니다. user가 이겼습니다. 비겼습니다.

        switch (user - computer) {
            case 2:
            case -1:
                System.out.println("컴퓨터가 이겼습니다");
                break;

            case 1:
            case -2:
                System.out.println("user가 이겼습니다");
                break;

            case 0:
                System.out.println("비겼습니다");
                break;

        }

    }

}


// 이기는 경우의 숫자
// : -1 2

// 비기는 경우의 숫자
// :0

// 지는 경우의 숫자
// : -2 1


// int result = user - computer; //이 방법도 있다.

// switch (result) {
//     case 2:
//     case -1:
//         System.out.println("컴퓨터가 이겼습니다");
//         break;

//     case 1:
//     case -2:
//         System.out.println("user가 이겼습니다");
//         break;

//     case 0:
//         System.out.println("비겼습니다");
//         break;

// }