import java.util.Scanner;

public class Calculator {
    
    // add numbers
    public static double addNumbers(){
        Scanner scanner =   new Scanner(System.in);
        System.out.println("How many numbers you like to add ?");
        int no_of_operands = scanner.nextInt();
        double[] operands = new double[no_of_operands];
        for(int i=0;i<no_of_operands;i++){
           System.out.print( "Enter number " + (i+1) + " : " ); 
           operands[i] = scanner.nextDouble();
        }
        double total = 0;
        for( int i = 0 ; i < no_of_operands ; i++ ){
            total += operands[i];
        }
        scanner.close();
        return total;
    }
    public static double substractNumbers(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the bigger number : ");
        double num_1 = scanner.nextDouble();

        System.out.print("Enter the smaller number : ");
        double num_2 = scanner.nextDouble();

        scanner.close();
        return num_1 - num_2 ;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one of the following operations");
        System.out.println("----------------------------------------");
        System.out.println("1. Add as may numbers as you want");
        System.out.println("2. Substract 2nd number from the first");
        System.out.println("----------------------------------------");
        System.out.print("Enter your choice : ");


        
        int choice = scanner.nextInt();
        switch(choice){
            case 1 : 
                System.out.println("The total is : " + addNumbers());
                break;
            case 2 :
                System.out.println("The substraction result is : " + substractNumbers());
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
        double total = addNumbers();
        System.out.println("The total is : " + total );
        scanner.close();
    }
}