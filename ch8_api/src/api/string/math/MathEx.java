package api.string.math;

public class MathEx {

    public static void main(String[] args) {

        double val = 90.7552;

        System.out.println("random() 0 ~ 1" + Math.random());

        // 올림, 버림, 반올림
        System.out.println("Math.ceil(val)" + Math.ceil(val));
        System.out.println("Math.floor(val)" + Math.floor(val));
        System.out.println("Math.round(val)" + Math.round(val));
        System.out.println("Math.min(x,y)" + Math.min(val, 95.25));
        System.out.println("Math.max(x,y)" + Math.max(val, 95.25));

        // print :
        // random() 0 ~ 10.17944071290775332
        // Math.ceil(val)91.0
        // Math.floor(val)90.0
        // Math.round(val)91
        // Math.min(x,y)90.7552
        // Math.max(x,y)95.25

    }

}
