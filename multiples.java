import java.util.Scanner;
public class multiples{
public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter your number");
int num = scan.nextInt();
System.out.println("Enter your limit ");
int limit = scan.nextInt();
for (int count = 1; count < 5; count++);
for (int mult =(num *(count)); mult <= limit;){
  System.out.println(mult);

num++;
}
}
}
