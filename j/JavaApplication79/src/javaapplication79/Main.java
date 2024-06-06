import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        Set<String> names = new HashSet<>(Arrays.asList("John", "Alice", "Bob", "Emily", "Michael"));
        

        System.out.println("Recorrer el conjunto usando una función flecha o lambda:");
        names.forEach(name -> System.out.println(name));
    }
}

