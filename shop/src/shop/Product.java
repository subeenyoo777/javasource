package shop;

public abstract class Product {
    private String pname; // 상품명
    private int price; // 가격

    // 추상 메서드를 가지고 있음

    public Product(String pname, int price) {
        this.pname = pname;
        this.price = price;
    }

    public void printDetail() {
        System.out.println("제품명 : " + this.pname);
        System.out.println("가격 : " + this.price);
        printExtra();
    }

    public String getPname() {
        return pname;
    }

    public int getPrice() {
        return price;
    }

    // abstract method
    public abstract void printExtra();

}
