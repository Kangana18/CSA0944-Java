import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
Scanner Sc = new Scanner(System.in);
System.out.println("Enter a number:");
int num = Sc.nextInt();
int Factorial = 1;
for (int i=1; i<=num; i++)
{
Factorial *= i;
}
Sc.close();
}
}