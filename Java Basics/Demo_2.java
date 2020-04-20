//Copy and Delete
public class Demo_2 {

	public static void main(String[] args) {
		
		 //Copying elements from one array to another
		        char[] source = { 'H', 'A', 'P', 'P', 'Y', 'L', 'E',
					    'A', 'R', 'N', 'I', 'N','G' };
		        char[] destination = new char[7];

		        System.arraycopy(source,0, destination, 1, 5);
		        System.out.println(new String(destination));
		        
		        //Deleting element from array
		        int flag=3;  //element to be deleted
		        for (int i = 0; i < source.length; i++) {
		        	// Delete Function
		        	if (flag == i) {
		        	for (int j = i + 1; i < source.length - 1; j++) {
		        	source[i] = source[j];
		        	i++;
		        	}
		        	System.out.println(source);
		        	}
		        	}	        
	}

}
