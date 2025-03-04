package oop;

import java.time.LocalDate;

public class ProductEx1 {
    public static void main(String[] args) {

        // 인스턴스 생성
        // ~할 시, 무조건 (new)생성자를 호출한다.
        Product product1 = new Product();

        // 생성자의 목적은 초기화이다. 생성자를 만들지 않았고 초기화가 안된 상태.
        // 초기화를 개별적으로 한다면
        product1.pcode = "p10214";
        product1.pName = "운동화";
        product1.price = 124000;
        product1.regiDate = LocalDate.now();

        // 초기화
        System.out.println(product1);
        // [결과값] Product [pcode=null, pName=null, price=0, regiDate=null]
    }
}
