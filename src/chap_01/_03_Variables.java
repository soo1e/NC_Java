package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "채수원";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다. ");

        double score = 90.5;
        char grade = 'A';
        name = "아자르";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14159;
        float f = 3.14123456f;
        System.out.println(d);
        System.out.println(f);

        long l = 123123123123123123L;
        l = 1_231_231_231_231_231_23L;
        System.out.println(l);

        // int, long, float, double, char, string, boolean
    }
}
