import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws Throwable {
        //String[] rim = {null,"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV"};
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] input1 = input.split(" ");
        String operand1 = input1[0];
        String operator = input1[1];
        String operand2 = input1[2];
        double ans;
        double num1;
        double num2;
        if (input1.length != 3)
            throw new Throwable("The format of the mathematical operation does not match the task - two operators and one operator (+, -, *, /)");
        try {num1 = Byte.parseByte(operand1);
            }catch(NumberFormatException nfe){
                throw new Throwable("Operand 1 is not a number");}
        try {num2 = Byte.parseByte(operand2);
            }catch(NumberFormatException nfe){
                throw new Throwable("Operand 2 is not a number");}
        if (num1 > 10 || num2 > 10)
            throw new Throwable("Operands cannot be greater than 10");
        ans = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new Throwable("The format of the mathematical operation does not match the task - two operators and one operator (+, -, *, /)");
        };
        System.out.print(ans);
    }}