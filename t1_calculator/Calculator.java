import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first no.: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second no.: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose an operation: +, -, *, /: ");
        char operator= scanner.next().charAt(0);
        
        double result=0;

        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
            case '*':
                result = num1 * num2;
            case '/':
                if(num2 != 0){
                    result = num1/num2;
                }else{
                    System.out.println("Error: Divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }
        System.out.println("Result: " + result);
    }

}