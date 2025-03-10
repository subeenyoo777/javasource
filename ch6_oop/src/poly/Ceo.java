package poly;

public class Ceo extends Employee {

    // 부모가 넘겨주는 것과 다르게 하려고 오버라이딩 함.
    @Override
    public void work() {
        System.out.println(getName() + " " + getPosition() + "이(가) 업무를 봅니다.");
    }
}

class PartTime extends Employee {
    @Override
    public void work() {
        System.out.println(getName() + " " + getPosition() + " 주어진 시간동안 일을 합니다");
    }

}

class Admin extends Employee {
    @Override
    public void work() {
        System.out.println(getName() + " " + getPosition() + "열심히 일을 합니다");
    }

}