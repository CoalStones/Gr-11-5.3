package ch5ex3;
import java.util.Scanner;

public class Ch5Ex3 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int egg;
        double price,total;
        
        System.out.println("How many eggs do you want to buy?");
            egg=input.nextInt();
            
            if(egg<48){
                price=0.5/12;
                total=egg*price;
                System.out.format("The cost is %.2f",total);
            }
            
            else if(egg>=48&&egg<72){
                price=0.45/12;
                total=egg*price;
                System.out.format("The cost is %.2f",total);
            }
            else if(egg>=72&&egg<132){
                price=0.4/12;
                total=egg*price;
                System.out.format("The cost is %.2f",total);
            }
            else{
                price=0.35/12;
                total=egg*price;
                System.out.format("The cost is %.2f",total);
            }
    }
    
}
