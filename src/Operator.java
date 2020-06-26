public class Operator {
    public static char char1;
    public Operator(char c) {
        char1 = c;
    }
    public Operator() {

    }

    public static char getOperator()
    {
        //System.out.println("Enter operation");
        // Scanner inp= new Scanner(System.in);
        // char1 = inp.next().charAt(0);
        return char1;
    }
}

