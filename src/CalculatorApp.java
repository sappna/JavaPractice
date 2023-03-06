//Make a calculater. Jisme jb tk user q ya Q press ni krta tb tk vo
//continuously console pe 2 space separated numbers input me maange.
//Uske baad select krne bole ki +,-,*,/ me se kya krna h. Vo kr k answer
//ko console pe print krwana hai.

import java.util.Objects;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        int num1=0;
        int num2=0;

        String input;
        char operator;
        Scanner take = new Scanner(System.in);

        System.out.println("Enter two nos or q/Q to quit !");
        input = take.nextLine();
        String[] key = input.split(" ");

        if(Objects.equals(key[0], "q") || Objects.equals(key[0], "Q")) {
            System.exit(0);

        } else {
                    do {
                        try{
                            num1 = Integer.parseInt(key[0]);
                            num2 = Integer.parseInt(key[1]);

                        } catch (NumberFormatException ex) {
                            System.out.println("Invalid Arguments!");
                            break;
                        }

                        System.out.println("Choose any one from + - * /");
                        operator = take.next().charAt(0);

                        if(checkOperator(operator)) {
                            calculator(num1, num2, operator);
                        };

                        System.out.println("Again enter two nos or q/Q to quit !");
                        input = take.nextLine();
                        key = input.split(" ");


                    } while (!Objects.equals(key[0], "q") || !Objects.equals(key[0], "Q"));
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

        double ans=0;
        switch (operator) {
                case '+' : ans = (num1 + num2);
                           break;
                case '-' : ans = (num1-num2);
                           break;
                case '*' : ans = ( (double) num1*num2 );
                           break;
                case '/' : ans = (double) num1/num2;
                           break;
        }
        System.out.println(ans);
    }

}
