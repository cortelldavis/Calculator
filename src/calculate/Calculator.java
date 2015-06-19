package calculate;

import java.util.Scanner;

/**
 *
 * @author cortelldavis
 */
public class Calculator {

    private int input1, input2, output;

    public Calculator() {
        this.input1 = 0;
        this.input2 = 0;
        this.output = 0;
    }

    public int Add(int a, int b) {
        input1 = a;
        input2 = b;
        output = (input1 + input2);
        return output;
    }

    public int Subtract(int a, int b) {
        input1 = a;
        input2 = b;
        output = (input1 - input2);
        return output;
    }

    public int Divide(int a, int b) {
        input1 = a;
        input2 = b;
        output = (input1 / input2);
        return output;
    }

    public int Multiply(int a, int b) {
        input1 = a;
        input2 = b;
        output = (input1 * input2);
        return output;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Calculator cal = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int result = 0, input1, input2, input3, output;
        String operation = "", message = "Choose One\n1. Add\n2. Multiply\n3. Subtract\n4. Divide?";
        System.out.println("Type your first input");
        input1 = scanner.nextInt();
        System.out.println("Type your second input");
        input2 = scanner.nextInt();
        System.out.println(message);
        input3 = scanner.nextInt();
        switch (input3) {
            case 1:
                result = cal.Add(input1, input2);
                operation = " plus ";
                break;
            case 2:
                result = cal.Multiply(input1, input2);
                operation = " multiplied by ";
                break;
            case 3:
                result = cal.Subtract(input1, input2);
                operation = " minus ";
                break;
            case 4:
                result = cal.Divide(input1, input2);
                operation = " divided by ";
                break;
        }
        System.out.println("This result of " + input1 + operation + input2 + " is " + result);
    }

}
