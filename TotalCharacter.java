import java.util.Scanner;

public class TotalCharacter {
    public static int Total(int number) {
      int sum = 0;
      do {
          sum += number%10;
          number = number/10;
      } while (number >=10);
      sum += number;
      return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int sum = Total(num);
        System.out.print("\nSum of characters of " + num + " is: " + sum);
    }
}
