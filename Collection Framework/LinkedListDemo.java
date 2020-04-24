import java.util.*;
public class LinkedListDemo{
   public static void main(String args[]){

      LinkedList<String> list=new LinkedList<String>();

      list.add("Steve");
      list.add("Karl");
      list.add("David");
      list.add("Mike");
      list.add("Ron");

      //Removing First element
      //Same as list.remove(0);
      list.removeFirst();

      //Removing Last element
      list.removeLast();

      //Iterating LinkedList
      Iterator<String> iterator=list.iterator();
      while(iterator.hasNext()){
         System.out.print(iterator.next()+" ");
      }

      //removing 2nd element, index starts with 0
      list.remove(1);

      System.out.print("\nAfter removing second element: ");
      //Iterating LinkedList again
      Iterator<String> iterator2=list.iterator();
      while(iterator2.hasNext()){
         System.out.print(iterator2.next()+" ");
      }
   }
}
