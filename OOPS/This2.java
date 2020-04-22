class Message{
	
	Message(){
		this("Annie");
		System.out.println("Welcome to Edureka");
	}
	
	Message(String n){
		System.out.println(n);
	}
}
public class This2 {

	public static void main(String[] args) {
		Message m=new Message();
	}
}
