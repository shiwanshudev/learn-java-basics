public class Calculate{
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        System.out.println("Add two nos: " + calculator.add(5 , 10));
        System.out.println("Add three nos: " + calculator.add(8 , 10 , 2500));
        System.out.println("Add floats: " + calculator.add(5.5 , 1.1));
    }
}

class Calculator{
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    };
}