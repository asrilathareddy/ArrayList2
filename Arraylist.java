import java.util.ArrayList;

public class Arraylist {
	public static void main(String args[])
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("java");
		a1.add("c");
		a1.add("c++");
		a1.add("php");
		a1.add("basic");
		System.out.println(a1);
		System.out.println("does this list contains java"+a1.contains("java"));
		a1.add(2,"cobol");
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		
		
	}

}
