import java.util.Scanner;
public class theLoop{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Please enter something");
String phrase = scan.nextLine();
int length = phrase.length();
int num= 0;
while (num < length) {
  System.out.println(phrase.charAt(num));

  num++;
}



}


}
