package shop;

public class User {
    private String name; // 고객명
    private PayType payType; // 결제방식

    public User(String name, PayType payType) {
        this.name = name;
        this.payType = payType;
    }

    public String getName() {
        return name;
    }

    public PayType getPayType() {
        return payType;
    }

}
