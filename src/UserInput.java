import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 = ខ្លា >> 2 = ឃ្លោក >> 3 = មាន់ >> 4 = បង្កង >> 5 = ក្តាម >> 6 = ត្រី");
        System.out.print("Pleas input number: ");

        int num = scanner.nextInt();

        System.out.println("========================");

        if(num > 6) {System.out.println("Number is only 1-6");

        System.out.println("========================");}

        int dice =(int) (Math.random() * 6) + 1;

        System.out.print("Your prediction is: " + " ");
        if(num == 1){
            System.out.println("ខ្លា");
        }else if( num == 2){
            System.out.println("ឃ្លោក");
        }else if( num == 3){
            System.out.println("មាន់");
        }else if( num == 4){
            System.out.println("បង្កង");
        }else if( num == 5){
            System.out.println("ក្តាម");
        }else if( num == 6){
            System.out.println("ត្រី");
        }else if(num > 6){
            System.out.println("None");
        }

        System.out.println("========================");

        System.out.print("Answer: " );

        if(dice == 1){
            System.out.println("ខ្លា");
        }else if( dice == 2){
            System.out.println("ឃ្លោក");
        }else if( dice == 3){
            System.out.println("មាន់");
        }else if( dice == 4){
            System.out.println("បង្កង");
        }else if( dice == 5 ){
            System.out.println("ក្តាម");
        }else if( dice == 6){
            System.out.println("ត្រី");
        }

        System.out.println("========================");

        if(num == dice){
            System.out.println("You win😂😂");
        }else {
            System.out.println("You lose😪😪");
        }
        System.out.println("========================");
    }
}
