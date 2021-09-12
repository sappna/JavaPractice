import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        String input;
        char operator;
        Scanner take = new Scanner(System.in);

        System.out.println("Enter two nos or q/Q to quit !");
        input = take.nextLine();
        String[] key = input.split(" ");

        if(key[0]=="q" || key[0]=="Q") {
            return ;
        } else {
                    do {
                        int num1 = Integer.parseInt(key[0]);
                        int num2 = Integer.parseInt(key[1]);

                        System.out.println("Choose any one from + - * /");
                        operator = take.next().charAt(0);

                        if(checkOperator(operator)) {
                            calculator(num1, num2, operator);
                        };

                        System.out.println("Again enter two nos or q/Q to quit !");
                        input = take.nextLine();
                        key = input.split(" ");


                    } while (key[0]!="q" || key[0]!="Q");

        }

    }
    //to check user entered correct operator
    private static boolean checkOperator(char operator) {
        if (operator=='+' || operator=='-' || operator=='*' || operator=='/') {
            return true;
        } else {
            System.out.println("You entered incorrect operator ! Start Again !!");
            return false;
        }
    }

    //to calculate
    private static void calculator(int num1, int num2, char operator) {

        double ans;
        switch (operator) {
                case '+' : ans = num1+num2;
                           System.out.println(ans);
                           break;
                case '-' : ans = num1-num2;
                           System.out.println(ans);
                           break;
                case '*' : ans = num1*num2;
                           System.out.println(ans);
                           break;
                case '/' : ans = num1/num2;
                           System.out.println(ans);
        }
    }

}
