package poly;

public class BuyerEx {

    public static void main(String[] args) {
        Buyer buyer = new Buyer();

        // buyer 가 tv를 산다, tv 객체를 넘겨줘야 한다.
        // Tv tv = new Tv(); 의 의미로 선언한다!
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        buyer.buy(new Audio());
        buyer.summary();

        // 우리는 물건을 살 때마다 계속 타입을 늘려야만 함(오버로딩)
        // -->(solve)
        // System.out.println("남은 돈은" + buyer.money + "만원입니다.");
        // System.out.println("현재 보너스 점수는" + buyer.bonusPoint + "입니다.");

        // 여러 객체를 한꺼번에 다루기 - 배열 객체
        // 상속관계가 없을 때 코드 작성

        // Computer computer[] = new Computer[3];
        // Tv tv[] = new Tv[3];
        // Audio audio[] = new Audio[3];

        // // 한꺼번에 컴퓨터 3대를 산다면
        // computer[0] = new Computer();
        // computer[1] = new Computer();
        // computer[2] = new Computer();

        // tv[0] = new Tv();
        // audio[0] = new Audio();

        // buyer.buy(computer);
        // buyer.buy(tv);
        // buyer.buy(audio);

        // 상속관계 => 매개변수 다형성

    }

}
