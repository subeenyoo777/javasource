package array;

public class ArraysEx14 {
    public static void main(String[] args) {

        int score[][] = {
                { 100, 78, 68 },
                { 55, 45, 80 },
                { 37, 45, 40 },
                { 89, 78, 65 },
                { 20, 30, 40 } };

        // 과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("===========================================");

        for (int i = 0; i < score.length; i++) { // 행 길이
            System.out.printf("%3d", i + 1);

            int sum = 0;/// 개인별 총점
            float avg = 0.0f; // 개인별 평균

            korTotal += score[i][0];
            engTotal += score[i][1];
            mathTotal += score[i][2];

            for (int j = 0; j < score[i].length; j++) { // 열 길이
                sum += score[i][j];

                // 개인별 점수 출력
                System.out.printf("%5d", score[i][j]);
            }
            // 개인별 평균 계산 후 출력
            avg = sum / (float) score[i].length;// 열 갯수가 달라지는 걸 대응하기 위함.
            System.out.printf("%5d %5.1f\n", sum, avg);// 행 출력 끝난 후 한 줄 띄움.

        }
        System.out.println("===============================================");
        System.out.printf("총점 : %3d %3d %3d", korTotal, engTotal, mathTotal);
    }

}
