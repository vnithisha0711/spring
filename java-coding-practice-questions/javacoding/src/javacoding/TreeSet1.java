package javacoding;
import java.util.*;
public class TreeSet1 {
public static void main(String args[]) {
	TreeSet<String> Emp=new TreeSet<String>();
	Emp.add("Nithisha");
	Emp.add("Deepthi");
	Iterator<String> i=Emp.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
