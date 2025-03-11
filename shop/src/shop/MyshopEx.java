package shop;

public class MyshopEx {
    public static void main(String[] args) {

        IShop shop = new Myshop();

        // 상점 이름 지정
        shop.setTitle("My shop Y");

        // 고객생성
        shop.genUser();

        // 제품생성
        shop.genProduct();

        // 상점 시작
        shop.start();
    }
}
