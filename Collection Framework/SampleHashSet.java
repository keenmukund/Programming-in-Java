import java.util.HashSet;
import java.util.*;
 
public class SampleHashSet {
    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> obj = new HashSet<>();
 
        // Adding new elements to the HashSet
        obj.add("Big Data");
        obj.add("Node.js");
        obj.add("Java");
        obj.add("Python");
        obj.add("Blockchain");
        obj.add("JavaScript");
        obj.add("Selenium");
        obj.add("AWS");
        obj.add("Machine Learning");
        obj.add("RPA");
         
 
        // Adding duplicate elements will be ignored
        obj.add("Java");
        obj.add("RPA");
 
        System.out.println(obj);
         
        // Check if the HashSet contains an specific element
        String myCourse = "Node.js";
        if(obj.contains(myCourse)) {
            System.out.println(myCourse + " is in the courses list.");
        } else {
            System.out.println(myCourse + " is not in the courses list.");
        }
         
        // Sorting eduCourses using List 
        List<String> list = new ArrayList<String>(obj); 
        Collections.sort(list); 
   
        // Printing the sorted elements of the HashSet 
        System.out.println("Printing the Courses in sorted order using List: " + list);
         
       // Removing items from HashSet using remove() 
        obj.remove("Python"); 
           
        // Iterating over HashSet items 
        System.out.println("Iterating over course list after removing Python:"); 
        Iterator<String> i = obj.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
         
         
        // Creating another object of HashSet 
        HashSet<String> obj2 = new HashSet<String>(); 
        obj2.add("Node.js"); 
        obj2.add("Python");
        obj2.add("Machine Learning");
                     
        //Removing all the new elements from HashSet  
        obj.removeAll(obj2);  
        System.out.println("After invoking removeAll() method courses left: "+ obj); 
         
        //Removing elements on the basis of specified condition  
        obj.removeIf(str->str.contains("Java"));    
        System.out.println("After invoking removeIf() method: "+ obj);  
         
        // Removing elements from eduCourses which are specified in eduNewCourses 
        obj.retainAll(obj2);
        System.out.println("HashSet after " + "retainAll() operation : " + obj2); 
         
        //Removing all the elements available in the set   
        obj.clear();  
        System.out.println("After invoking clear() method: "+ obj); 
        
    }
}
