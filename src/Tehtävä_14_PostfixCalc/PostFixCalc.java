package Tehtävä_14_PostfixCalc;

import java.util.Stack;

public class PostFixCalc {

    private Stack<Double> stack = new Stack<>();
    double val1, val2;

    public double vastaus(String s) {
        System.out.println(s);
        String[] temp = s.split(",");
        for (String ss : temp) {
            switch (ss) {
                case "+":
                    System.out.println("yhteenlasku 2 ylintä");
                    stack.push(stack.pop() + stack.pop());
                    System.out.println(stack);
                    break;
                case "-":
                    System.out.println("vähennyslasku 2 ylintä");
                    val1 = stack.pop();
                    val2 = stack.pop();
                    stack.push(val2 - val1);
                    System.out.println(stack);
                    break;
                case "*":
                    System.out.println("kertolasku 2 ylintä");
                    stack.push(stack.pop() * stack.pop());
                    System.out.println(stack);
                    break;
                case "/":
                    System.out.println("jakolasku 2 ylintä");
                    val1 = stack.pop();
                    val2 = stack.pop();
                    if (val2 == 0) { System.out.println("ei voi jakaa nollalla"); return 0; }
                    stack.push(val2 / val1);
                    System.out.println(stack);
                    break;
                default:
                    System.out.println("lisätty uusi numero");
                    stack.push(Double.parseDouble(ss));
                    System.out.println(stack);
            }
        }
        System.out.println("lopputulos\n");
        return stack.pop();
    }
}
