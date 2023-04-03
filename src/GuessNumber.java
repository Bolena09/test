import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of attempts:");
        int attempt = scan.nextInt();
        System.out.println("Enter low boundary: ");
        int lowerBound = scan.nextInt();
        System.out.println("Enter upper boundary: ");
        int upperBound = scan.nextInt();
        //Создаем экземпляр класса Random()
        Random rand = new Random();
        //Создаем переменную типа int
        int randInt;
        //Сохраняем случайное число в переменной randInt;
        randInt = lowerBound + rand.nextInt ((upperBound - lowerBound) + 1);
        int done = 0;
        boolean status = false;
        while (done <= attempt) {
            if (done < attempt) {
                System.out.println("Enter your number:");
                int number = scan.nextInt();
                if (randInt > number) {
                    System.out.println("My number is more");
                } else if (randInt < number) {
                    System.out.println("My number is less");
                } else /*(randInt == number)*/ {
                    System.out.println("You guessed!");
                    break;
                }
                done++;
            }  else {
                System.out.println("You didn't guess(");
                System.out.println("My number was " + randInt);
                break;
            }
        }
    }
}
