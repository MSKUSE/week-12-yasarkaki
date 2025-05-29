import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        StackLinkedList<Number> stack = new StackLinkedList<>();
        stack.push(3);
        stack.push(45);
        stack.push(3.4);
        stack.push("This is a test");
        stack.displayStack();


//        ArrayList<String> stringArrayList = new ArrayList<String>();
//        stringArrayList.add("String");
//        HashMap<String , Double> grades = new HashMap<>();
//        grades.put("Ali",35.0);
//        System.out.println(grades);
//        grades.put("Pelin",90.0);
//        System.out.println(grades);
//        grades.put("Enes",10.0);
//        System.out.println(grades);
//        grades.put("Ali",60.0);
//        System.out.println(grades);
//        System.out.println(grades.keySet() instanceof Set);




    }
}