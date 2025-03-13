package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Myshop2 implements IShop {

    private String title;

    // private User[] users = new User[5];
    private List<User> users = new ArrayList<>();

    // private Product[] products = new Product[10];
    private List<Product> products = new ArrayList<>();

    // cart (제품 저장 가능한 배열)
    // private Product[] cart = new Product[10];
    private List<Product> cart = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // start()에서 선택된 user 보관 변수
    private String selUser;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void genUser() {
        users.add(new User("홍길동", PayType.CARD));
        users.add(new User("성춘향", PayType.CASH));
    }

    @Override
    public void genProduct() {
        // 5개 제품 생성 후 배열객체에 담기(tv 2개, cellphone 3개)
        products.add(new CellPhone("갤럭시s25", 10, "SKT"));
        products.add(new CellPhone("아이폰", 20, "U+"));
        products.add(new CellPhone("LG울트라HD", 30, "4K"));
        products.add(new CellPhone("삼성QLED", 40, "QLED"));
        products.add(new CellPhone("갤럭시A3", 50, "KT"));
    }

    @Override
    public void start() {

        System.out.println(title + ": 메인화면 - 계정선택");
        System.out.println("=================================");
        int i = 0;

        for (User user : users) {
            if (user != null) {
                System.out.printf("[%d] %s (%s)\n", i++, user.getName(), user.getPayType());
            }
        }
        System.out.println("[x] 종료");
        System.out.println("=================================");
        System.out.println("선택 : "); // 0 or 1 or x

        String input = sc.nextLine();

        switch (input) {
            case "x":
            case "X":
                System.exit(0);
                break;
            case "0":
            case "1":
                // 사용자가 선택한 유저 정보를 담아 check out에서 쓰고 싶다, 해당 메소드 필요.
                selUser = input;
                productList();
                break;
            default:
                System.out.println("입력을 확인해주세요");
        }
    }

    public void productList() {

        System.out.println(title + " 상품목록 - 상품선택 ");
        System.out.println("=================================");
        int i = 0;

        for (Product product : products) {
            if (product != null) {
                System.out.printf("[%d]", i++);
                product.printDetail();
            }
        }
        System.out.println("[h] 메인화면");
        System.out.println("[c] 체크아웃");
        System.out.println("=================================");
        System.out.print("선택 : ");

        String input = sc.nextLine(); // 0~4 또는 h~c 입력 가능(String 으로 받기)

        switch (input) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4": // cart 배열에 선택한 제품 담기
                cart.add(products.get(Integer.parseInt(input)));

                productList();
                break;

            case "h":
                start();
                break;

            case "c":
                checkout();
                break;

            default:
                break;
        }

    }

    public void checkout() {
        System.out.println(title + users.get(Integer.parseInt(selUser)).getName() + " - 체크아웃");
        System.out.println("==================================================================");

        int i = 0, sum = 0;

        for (Product product : cart) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getPname(), product.getPrice());
                sum += product.getPrice();

                product.printDetail();
            }
        }
        System.out.println("결제 방법 : " + users.get(Integer.parseInt(selUser)).getPayType());
        System.out.println("합계 " + sum);
        System.out.println("==================================================================");
        System.out.println("[p] 이전");
        System.out.println("[q] 종료");
        System.out.println("선택 : "); // p => 이전, q => 종료

        String input = sc.nextLine();

        switch (input) {
            case "q":
                System.exit(0);
                break;

            case "p":
                productList();
                break;
            default:
                break;
        }
    }

}
