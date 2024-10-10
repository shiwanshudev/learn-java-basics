import java.util.HashMap;

public class HashMapEx{
    public static void main(String[] args){
        HashMap<String, Integer> employeeSal = new HashMap<>();
        employeeSal.put("Ram", 50000);
        employeeSal.put("Jyoti", 70000);
        employeeSal.put("Shristi", 57000);

        System.out.println("Salary of Ram" + employeeSal.get("Ram"));

        for(String employee: employeeSal.keySet()){
            System.out.println("Salary of " + employee + " is " + employeeSal.get(employee));
        }
        employeeSal.remove("Jyoti");
        System.out.println(employeeSal);
    }
}