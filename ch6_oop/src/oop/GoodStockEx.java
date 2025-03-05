package oop;

public class GoodStockEx {
    public static void main(String[] args) {
        // new GoodStock() : default 생성자를 호출하면서
        // instnace를 생성한다.

        // default 생성자.. 값을 초기화
        // GoodStock goodStock = new GoodStock();
        // goodStock.code = "p1013";
        // goodStock.stockNum = 50;

        GoodStock goodStock = new GoodStock("p1013", 50);

        System.out.println(goodStock);

        // 판매 - 5
        goodStock.subtracStock(5);
        // 현재 재고수량 확인
        System.out.println(goodStock);

        // 제품 입고 10
        goodStock.addStock(10);
        System.out.println(goodStock);
    }
}

// default 새성자만 실행했을 때 결과값
