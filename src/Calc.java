import java.io.Serializable;

public class Calc {
    public static Serializable calculate(input inp) {
        int ans = 0;
        char choose = 0;
        if (ans<1 || ans>10 )
            return ("error");



        choose = inp.getOperator();

        switch (choose) {
            case '+':
                ans = add(inp);
                break;
            case '-':
                ans = sub(inp);
                break;
            case '*':
                ans = mult(inp);
                break;
            case '/':
                ans = div(inp);
                break;

            default:
                System.out.println("Wrong Operation");

        }
        return choose;
    }

    public static int add(input inp) {
        int result = inp.getNum1() + inp.getNum2();
        return result;
    }

    public static int sub(input inp) {
        int result = inp.getNum1() - inp.getNum2();
        return result;
    }

    public static int mult(input inp) {
        int result = inp.getNum1() * inp.getNum2();
        return result;
    }

    public static int div(input inp) {
        int result = inp.getNum1() / inp.getNum2();
        return result;

    }
}



