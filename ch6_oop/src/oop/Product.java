package oop;

import java.time.LocalDate;

public class Product {
    // 속성
    // :제품 번호(p10214), 제품명(운동화), 가격(124000), 제조년월일(2025-03-04)

    String pcode;
    String pName;
    int price;
    LocalDate regiDate;

    // 생성자 : 개발자가 명시하지 않으면 자동으로 default 생성자 만들어줌.
    // → Product(){}

    // 메소드 // 기능 - 가격을 변경
    void changeprice() {

    }

    @Override
    public String toString() {
        return "Product [pcode=" + pcode + ", pName=" + pName + ", price=" + price + ", regiDate=" + regiDate + "]";
    }

}
