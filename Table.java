public class Table {
public static void main(String[] args){
int num = 9;
int limit=10;
System.out.println("Multiplication table of " + num + ":");
for(int i=1; i<=limit;i++){
int result=num*i;
System.out.println(num + "x" +i+"="+result);
}
}
}