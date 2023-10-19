import java.io.File; 
import java.util.Scanner;
import java.io.FileNotFoundException;
public class DonationsTester 
{
public static void main(String[] args)throws FileNotFoundException 
{
File inputFile = new File("Donations(1).txt");
Scanner sc = new Scanner(System.in);
System.out.println("would you like to processdontions?");
String go = sc.next();
Donations giveToMe = new Donations();
String cat = " ";
double amount = 0;
if (go.equals("yes"))
{
Scanner in = new Scanner(inputFile);
while (in.hasNextLine())
{
String what = in.nextLine();
if (what.startsWith("<other")){
what.split(">");
String [] numb = what.split(">");
double numb1 = Double.parseDouble(numb[1]);
System.out.println("Other");
System.out.println(numb1);}
if (what.startsWith("<individual")){
what.split(">");
String [] numbe = what.split(">");
double numbe1 = Double.parseDouble(numbe[1]);
System.out.println("Individual");
System.out.println(numbe1);}
if (what.startsWith("<business")){
what.split(">");
String [] number = what.split(">");
Double Number1 = Double.parseDouble(number[1]);
System.out.println("business");
System.out.println(Number1);}
}
}
}
}


