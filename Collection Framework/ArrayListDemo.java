import java.util.*;

public class ArrayListDemo {
   public static void main(String args[]) {
    
      ArrayList<String> obj = new ArrayList<String>();

      obj.add("Ron");
      obj.add("Sam");
      obj.add("Mohan");
      obj.add("Steve");
      obj.add("Mike");

      System.out.println("Original ArrayList:");
      for(String str:obj)
         System.out.println(str);

      obj.add(0, "Rahul");
      obj.add(1, "Justin");

     
      System.out.println("ArrayList after add operation:");
      for(String str:obj)
         System.out.println(str);

      obj.remove("Sam"); 
      obj.remove("Mike"); 

      System.out.println("ArrayList after remove operation:");
      for(String str:obj)
         System.out.println(str);

      obj.remove(1); 

      System.out.println("Final ArrayList:");
      for(String str:obj)
         System.out.println(str);
   }
}
