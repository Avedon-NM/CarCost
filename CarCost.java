import java.util.Scanner; 
/** 
*	@author Your Name Avedon Maramba
* */ 
public class CarCost 
{ 
   public static void main(String[] args) 
   { 
      Scanner scan = new Scanner(System.in);
       
      System.out.println("Please enter car cost");
      int carCost = scan.nextInt();
      
      System.out.println("Please enter miles per litre");
      double fuelEfficiency = scan.nextDouble();
      
      System.out.println("Please enter fuel cost per litre in £");
      double fuelCost = scan.nextDouble();
      
      System.out.println("Please enter annual mileage");
      int totalMiles = scan.nextInt();
      
      System.out.println("Please enter resale value afer 5 years");
      double resaleValue = scan.nextDouble();
      
      double annualFuelCost = (totalMiles / (fuelEfficiency * fuelCost)); 
      double totalCost =  carCost + (annualFuelCost * 5);
      
      final double DE_APPRECIATION = carCost - resaleValue;
      System.out.println("Total cost after 5 years is £" + (int) totalCost);
      System.out.println("Total deappreciation after 5 years is £" + (int) DE_APPRECIATION );
      
       
      
   }
}    
      
      
      

      
      