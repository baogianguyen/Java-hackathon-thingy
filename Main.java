import java.util.Scanner;

public class Main {
  static void grade() {
    int num = 0; 
    Scanner scanner = new Scanner(System.in);
    int grade = 174;

    while (num == 0) {
    System.out.print("Enter your grade: ");
    int guess = scanner.nextInt();

    if (guess < grade) {
      System.out.println("too low");
      continue;
    }
    else if (guess > grade) {
      System.out.println("too high"); 
      continue;
    } else if (guess == grade) {
      System.out.println("Correct!"); 
      break;
    }

    scanner.close();
}} 
  public static void main(String[] args) {
   grade();
  }
  }