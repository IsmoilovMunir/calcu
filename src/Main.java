import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calc Calculator = new Calc();
        start(Calculator);
        Scanner reader = new Scanner(System.in);
        System.out.println(reader.nextLine());


    }

    private static void start(Calc calc) {
        System.out.println(Calc.calculate(new input().setInput()));
        decision(calc);
    }

    public static void decision(Calc calc) {

        Scanner inp2 = new Scanner(System.in);
        int num3;
        num3 = inp2.nextInt();

        if (num3 == 0) {
            start(calc);
        } else {
            System.out.println("Exit");
        }

    }

}