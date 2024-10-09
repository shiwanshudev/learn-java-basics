import java.util.HashSet;

public class HashSetExample{
   public static void main(String[] args){
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(29);
        System.out.println(numbers);

        for(Integer number: numbers){
            System.out.println(number);
        }
    
        System.out.println("Size: " + numbers.size());
   } 
}