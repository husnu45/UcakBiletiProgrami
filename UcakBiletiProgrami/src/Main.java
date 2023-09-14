
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner getData = new Scanner(System.in);
        
        int distance , age;
        
        int roundOrOneWay;
        
        double pricePerKM = 0.10;
        
        System.out.print("Please Enter the Distance of Your Destination (KM) : ");
        
        distance = getData.nextInt();
        
        System.out.print("Please Enter Your Age : ");
        
        age = getData.nextInt();
        
        System.out.print("Select Your Ticket Type : Press 1 for One-Way Ticket , Press 2 for Round-Trip : ");
        
        roundOrOneWay = getData.nextInt();
        
        getData.close();
        
        double totalPrice = (distance * pricePerKM);
        
        if(distance < 0 || age < 0 || (roundOrOneWay < 0 && roundOrOneWay > 2)){
            
            System.out.println("Invalid Transaction");
        
        }
        
        else{
            
             if(age < 12){
            
            totalPrice /= 2;
            
        }
        
        else if(age < 24 && age >12){
            
            totalPrice = totalPrice - (totalPrice * 10 / 100);
            
        }
        
        else if(age > 65){
            
            totalPrice = totalPrice - (totalPrice * 30 / 100);
        }
        
        
        if(roundOrOneWay == 2){
            
            totalPrice *= 0.8;
            
        }
        
         System.out.println("Total Price is " + totalPrice);
        
        }
        
       
        
       
        
        
        
        
        
        
        
        
    }
    
}
