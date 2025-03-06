package oop;

public class TvEx {

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.size = 50;
        tv.color = "black";

        Tv2 tv2 = new Tv2(60, "white");
        // tv2.size = 50;..The field Tv2.size is not visible

        // tv 켜기
        tv2.power();
        // 채널변경
        tv2.changeCannel(7);

        Tv2 tv3 = new Tv2();
        tv3.power();
        tv3.changeCannel(11);

        Tv3 obj1 = new Tv3();
        System.out.println("처음 상태");
        System.out.println(obj1.toString());
        // Tv [size=0, color=null, channel=0, volume=0, power=false]

        obj1.setSize(60);
        obj1.setColor("green");
        System.out.println("색상" + obj1.getColor());
        System.out.println("사이즈" + obj1.getSize());
    }
}
