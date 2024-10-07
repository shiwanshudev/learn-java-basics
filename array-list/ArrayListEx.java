import java.util.ArrayList;

class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Marie");
        students.add("Hana");
        students.add("Mick");
        
        for(String student : students){
            System.out.println("Student: " + student);
        }
        
        System.out.println(students.get(1)); 
        students.remove("Mick");
        System.out.println(students);
    }
}