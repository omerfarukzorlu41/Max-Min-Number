import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,howMany;
        System.out.print("How many numbers will be entered? : ");
        howMany = scanner.nextInt();

        for(int i =1; i <= howMany ;i++){
            System.out.print(i+". number : ");
            number = scanner.nextInt();
            if(number < min){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }
        System.out.println("The smallest of the entered numbers: "+min);
        System.out.println("Largest of the entered numbers: "+max);

    }
}
