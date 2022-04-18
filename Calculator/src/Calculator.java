import java.util.Objects;
import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) throws Throwable{
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] input1 = input.split(" ");
        String operand1 = input1[0];
        String operator = input1[1];
        String operand2 = input1[2];
        byte num1;
        byte num2;
        if (input1.length != 3)
            throw new Throwable("The format of the mathematical operation does not match the task - two operands and one operator (+, -, *, /)");
        try {num1 = Byte.parseByte(operand1);
            }catch(NumberFormatException nfe){
                try {num2 = Byte.parseByte(operand2);
                    }catch(NumberFormatException nFE){
                    String[] rim = {null,"I","II","III","IV","V","VI","VII","VIII","IX","X","XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX","XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL","XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","IL","L","LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX","LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX","LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX","LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC","XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","IC","C"};
                    byte i = 1;
                    while(!Objects.equals(operand1, rim[i])){
                        if(i == 10)
                            throw new Throwable("Operand 1 is larger than X or is not a number");
                        i++;}
                    num1 = i;
                    i = 1;
                    while(!Objects.equals(operand2, rim[i])){
                        if(i == 10)
                            throw new Throwable("Operand 2 is larger than X or is not a number");
                        i++;}
                    num2 = i;
                    int ans = switch(operator){
                        case "+" -> num1 + num2;
                        case "-" -> num1 - num2;
                        case "*" -> num1 * num2;
                        case "/" -> num1 / num2;
                        default -> throw new Throwable("The operator can only be one of the following: '+', '-', '*', '/'");};
                    if(ans < 1)
                        throw new Throwable("The answer cannot be less than one in roman numerals");
                    System.out.print(rim[ans]);
                    System.exit(0);}
                throw new Throwable("Both arab and roman numerals are present or operand 1 is not a number");}
        try {num2 = Byte.parseByte(operand2);
            }catch(NumberFormatException nfe){
                throw new Throwable("Both arab and roman numerals are present or operand 2 is not a number");}
        if (num1 > 10 || num2 > 10 || num1 == 0 || num2 == 0)
            throw new Throwable("Operands cannot be larger than 10 or smaller than 1");
        int ans = switch(operator){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new Throwable("The operator can only be one of the following: '+', '-', '*', '/'");};
        System.out.print(ans);}}