import java.util.Scanner;

public class JapaneseName {
    public static void japanName(){
        System.out.println("My Japanese Name");

        // Get input from user

        Scanner mScaner = new Scanner(System.in);
        String name;
        System.out.print("Please input you name: ");
        name = mScaner.next();
        name = name.toLowerCase();



        for (int i = 0; i < name.length(); i ++){
            char N = name.charAt(i);
            if(N == 'a'){
                System.out.print("Ka");
            }else if(N == 'b'){
                System.out.print("Tu");
            }else if(N == 'c'){
                System.out.print("Mi");
            }else if(N == 'd'){
                System.out.print("Te");
            }else if(N == 'e'){
                System.out.print("Ku");
            }else if(N == 'f'){
                System.out.print("Lu");
            }else if(N == 'g'){
                System.out.print("Ji");
            }else if(N == 'h'){
                System.out.print("Ri");
            }else if(N == 'i'){
                System.out.print("Ki");
            }else if(N == 'j'){
                System.out.print("Zu");
            }else if(N == 'k'){
                System.out.print("Me");
            }else if(N == 'l'){
                System.out.print("Ta");
            }else if(N == 'm'){
                System.out.print("Rin");
            }else if(N == 'n'){
                System.out.print("to");
            }else if(N == 'o'){
                System.out.print("Mo");
            }else if(N == 'p'){
                System.out.print("No");
            }else if(N == 'q'){
                System.out.print("Ke");
            }else if(N == 'r'){
                System.out.print("Shi");
            }else if(N == 's'){
                System.out.print("Ari");
            }else if(N == 't'){
                System.out.print("Chi");
            }else if(N == 'U'){
                System.out.print("Do");
            }else if(N == 'V'){
                System.out.print("Ru");
            }else if(N == 'W'){
                System.out.print("Mei");
            }else if(N == 'x'){
                System.out.print("Na");
            }else if(N == 'y'){
                System.out.print("Fu");
            }else if(N == 'z'){
                System.out.print("Zi");
            }
        }
    }
}
