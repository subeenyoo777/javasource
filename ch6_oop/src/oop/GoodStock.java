package oop;

public class GoodStock {
    // 속성: code(상품코드: pl013), stockNum(재고수량: 50)

    String code;
    int stockNum;

    // 기본 생성자 (괄호 안에 아무것도 없으면. 선택사항)
    // public GoodStock() {
    // }

    // 생성자(매개변수 있는)
    @Override
    public String toString() {
        return "GoodStock [code=" + code + ", stockNum=" + stockNum + "]";
    }

    // 기능: 재고 추가, 재고 감소.
    void subtracStock(int num) { // 판매된 수량을 받아 감소하고 싶음.
        this.stockNum -= num;

    }

    public GoodStock(String code, int stockNum) {
        this.code = code;
        this.stockNum = stockNum;
    }

    void addStock(int num) { // 판매된 수량을 받아 증가하고 싶음.
        this.stockNum += num;
    }

}
