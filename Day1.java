package ProgrammerSchool;

public class Day1 {

    public static void main(String[] args) {

        int answer = sum(3, 4);
        System.out.println(answer);

        int answer2 = subtract(7, 2);
        System.out.println(answer2);

        int answer3 = multiple(2, 6);
        System.out.println(answer3);

        int answer4 = divide(8, 4);
        System.out.println(answer4);

    }

    private static int divide(int i, int j) {
        int answer =0;
        answer = i /j;
        return answer;
    }

    private static int multiple(int i, int j) {
        int answer =0;
        answer = i * j;
        return answer;
    }

    public static int sum(int num1, int num2) {
        int answer =0;
        answer = num1 + num2;
        return answer;
    }

    public static int subtract(int num1, int num2) {
        int answer =0;
        answer = num1 + num2;
        return answer;
    }
}


