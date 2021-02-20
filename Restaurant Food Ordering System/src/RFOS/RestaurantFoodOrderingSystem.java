package RFOS;

import java.util.Scanner;

//class declaration
public class RestaurantFoodOrderingSystem {

	 //method declaration
		public static void main(String[] args) {
			//declaring variables
		int pizza_order, cake_order,drink_order,quantity,choice;
		double price = 0,total_price;
		 double chicken_pizza=10, lamb_pizza=12, special_pizza=12, none=0;
		double pia_cake=10, chocolate_cake=10 , strawberry_cake=12.00;	
		double cocacola=2, water=1, pepsi=2;
		char ans;
		//restaurant logo
		    System.out.println(" \t----------------------------------");
			System.out.println("\t|                                  |");
			System.out.println("\t|            WECOME TO             |");
			System.out.println("\t|           BD RESTURANT           |");
			System.out.println("\t|                                  |");
			System.out.println(" \t----------------------------------");
		do{	
			System.out.println("\n\t Please check our Menu below.");
			
			Scanner input= new Scanner(System.in);
			//menu making with array
			System.out.println("\n\t Here is our Pizza menu");
			String[] pizzaItemNames= new String[4];
			double[] pizzaItemPrices= new double[4];
			
			pizzaItemNames[0]="1.Chicken Pizza";
			pizzaItemPrices[0]=10.00;
			
			pizzaItemNames[1]="2.Lamb Pizza   ";
			pizzaItemPrices[1]=12;
			
			pizzaItemNames[2]="3.Special Pizza";
			pizzaItemPrices[2]=12.00;
			
			pizzaItemNames[3]="4.None         ";
			pizzaItemPrices[3]=0;
			
			for(int i=0; i< pizzaItemNames.length; i++){
				System.out.println(pizzaItemNames[i]+" ------------------------ "+pizzaItemPrices[i]);
					}
			System.out.print("Please enter the number of Pizza chosen (1,2,3,4) : ");//order taken from custome
			 pizza_order= input.nextInt();
			System.out.print("How many do you want? : ");
	           quantity=input.nextInt();
			
			System.out.println("\n\t Here is our cake menu");
			String[] cakeItemNames= new String[4];
			double[] cakeItemPrices= new double[4];
			
			cakeItemNames[0]="1.Chocolate cake ";
			cakeItemPrices[0]=10.00;
			
			cakeItemNames[1]="2.Pia cake       ";
			cakeItemPrices[1]=10.00;
			
			cakeItemNames[2]="3.Strawberry cake";
			cakeItemPrices[2]=12.00;
			
			cakeItemNames[3]="4.NONE           ";
			cakeItemPrices[3]=0;
					
			for(int i=0; i< cakeItemNames.length; i++){
				System.out.println(cakeItemNames[i]+" ------------------------ "+cakeItemPrices[i]);
					}
			System.out.print("Please enter the number of cake chosen (1,2,3,4) : ");
			cake_order= input.nextInt();
			System.out.print("How many do you want? : ");
			quantity=input.nextInt();

			System.out.println("\n\t Here is our drinks menu");
			String[] drinkItemNames= new String[3];
			double[] drinkItemPrices= new double[3];
			
			drinkItemNames[0]="1.Pepsi       ";
			drinkItemPrices[0]=2;
			
			drinkItemNames[1]="2.Cocacola    ";
			drinkItemPrices[1]=2;
			
			drinkItemNames[2]="3.Normal water";
			drinkItemPrices[2]=1;
			
			
			for(int i=0; i< drinkItemNames.length; i++){
				System.out.println(drinkItemNames[i]+" ------------------------ "+drinkItemPrices[i]);
					}
			System.out.print("Please enter the number of drink chosen (1,2,3) : ");
			drink_order= input.nextInt();
			System.out.print("How many do you want? : ");
			quantity=input.nextInt();
	       //condition for price calculating
			switch(pizza_order){
	        case 1:
	          price=(chicken_pizza *quantity);
	        break;
	       case 2:
	          price=(lamb_pizza *quantity);
	        break;
	       case 3:
	         price=(special_pizza *quantity);
	        break;
	        case 4:
	              price= (none*quantity);
	        break;
	       default:
	         System.out.println("Invalid Choice");
	      }
			switch(cake_order){
		    
		    case 1:
		      price=price +  (chocolate_cake * quantity);
		    break;
		    case 2:
		        price=price + (pia_cake * quantity);
		    break;
		    
		    case 3:
		      price=price +( strawberry_cake * quantity);
		    break;
		    case 4:
		              price=price +( none* quantity);
		        break;
		    default:
		    	 System.out.println("Invalid Choice");
		    }
		  switch(drink_order){
		   case 1:
		      price=price + (pepsi * quantity);
		    break;
		    case 2:
		       price=price + (cocacola * quantity);
		    break;
		    case 3:
		      price=price +( water * quantity);
		    break; 
		    default:
		    	 System.out.println("Invalid Choice");
		  }
		  total_price= ((pizza_order)  + (cake_order) + (drink_order)) ;
		  System.out.println("\nHere is your price"+ price);
		  total_price= price + 0.06;
		  System.out.println("Here is your total price including 6% TAX"+ total_price);
		  
		  System.out.print("\nDo you want to use again?(y/n): ");
		    Scanner scanner =new Scanner(System.in);
			 ans=scanner.next().charAt(0);
		  if (ans== 'n'){
			  System.out.println("Thank you, Please Come again");}
		 
		}while(ans!='n');//repetition of program
				
		}
	}
	//END
	//ALL RIGHTS RESERVED TO SARWAR ALAM SAJIB
	//THANKYOU
