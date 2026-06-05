import java.util.HashSet;
import java.util.Set;
public class set {
public static void main(String[] args) {
Set<Integer> numbers = new HashSet<>();
numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
System.out.println("Set Elements: " + numbers);
System.out.println("Contains 3? " + numbers.contains(3));
numbers.remove(2);
        System.out.println("After Removing 2: " + numbers);
     System.out.println("Size of Set: " + numbers.size());
     System.out.println("Is Set Empty? " + numbers.isEmpty());
     System.out.println("Elements using loop:");
      for (Integer num : numbers) {
            System.out.println(num);
        }
     numbers.clear();
     System.out.println("After Clear: " + numbers);
    }
}