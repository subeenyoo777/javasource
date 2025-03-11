package shop;

public class Tv extends Product {

    private String resolution;

    public Tv(String pname, int price, String resolution) {
        super(pname, price);
        this.resolution = resolution;
    }

    @Override
    public void printExtra() {
        System.out.println("해상도 : " + this.resolution);
    }

}
