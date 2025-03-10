package poly;

public class EmployeeEx {
    public static void main(String[] args) {
        // [다형성]
        // work로 같은 선언문을 실행했을 때, 여러가지 형태로 결과를 출력했다.
        // 한 타입의 참조변수를 여러 타입의 객체를 참조한다.
        // 만들어지는 건 new~ 선언된 객체이다.

        Employee employee1 = new Employee();
        employee1.setName("홍길동");
        employee1.setPosition("사원");
        // employee1.work();
        doWork(employee1);

        employee1 = new Ceo();
        employee1.setName("김동호");
        employee1.setPosition("대표");
        // employee1.work();
        doWork(employee1);

        employee1 = new PartTime();
        employee1.setName("이민지");
        employee1.setPosition("시간제");
        // employee1.work();
        doWork(employee1);

        employee1 = new Admin();
        employee1.setName("관리자");
        employee1.setPosition("admin");
        // employee1.work();
        doWork(employee1);

    }

    static void doWork(Employee e) {
        e.work();
    }

}
// 다형성이 없었다면 일일이 다 선언했어야 한다.
// static void doWork(Ceo e) {
// e.work();
// }

// static void doWork(PartTime e) {
// e.work();
// }
