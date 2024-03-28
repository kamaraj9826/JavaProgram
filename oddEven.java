package JavaProgram;
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n/2 == 0){
            System.out.println("Given number is Even");
        }
        else{
            System.out.println("Not");
        }

    }
}
