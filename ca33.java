  import java.util.*;

class ca33
{
	 static int start() {

        boolean yn=true;
        int x=0;
      Scanner sc= new Scanner(System.in);
      	while(yn)
      	{
      		String answer = sc.nextLine().trim().toLowerCase();
      		if (answer.equals("y")) {
                            yn = true;
                            System.out.println("enter number of days of extension");
                            x=sc.nextInt();
                             break;
      	           }
      	    else if (answer.equals("n")) {
      	     	yn = false;
      	     	x=0;
      	     	break;
      	     	
      	          }
      	    else {
                             System.out.println("Sorry, I didn't catch that. Please answer y/n");
                   }     
         }
return x;
     }
   public static void main(String[] args)
   {

        boolean yn;
        
      Scanner sc= new Scanner(System.in);
       System.out.println("TOUR AND TRAVELS");

      System.out.println("1.Manali\n2.Jammu\n3.Goa\n4.kanyakumari\n5.Exit");

      System.out.println("Choice the place");
      int i = sc.nextInt();



     

        	
      
      switch(i){
        case 1:
          System.out.println("Manali Package");
          System.out.println("11. 3* Hotel 3day/2nights cost=4999\n12. Normal Hotel 3day/2nights cost=2999\n");
          System.out.println("choose the Package");
          int j=sc.nextInt();
          switch(j){
          	case 11:{
          	 System.out.println("if extension required press 'y' else press 'n'");
            
          	ca33 myprogram = new ca33();
                
              int x=myprogram.start();

              
          	  
          	   System.out.println("*-------------------------------------------------------------------------------------------*\n");
                         System.out.println("                                        TRIP TO MANALI\n");
                         System.out.println("Hotel chosen                                  = 3 Star Hotel");
                         
                         int y=3+x;
                         int z=x+2;
                         int t=(x*1000)+4999;
                         System.out.println("Extra cost per day if extended else ignore    = 'Rs 1000' "); 
                         System.out.println("Total number of days of stay is               = "+ y+"days/"+z+"nights");
                         System.out.println("Total cost for the trip                       = "+t); 
                         System.out.println("\n\n                                   Thank you have a nice trip\n                     enjoy your trip ");
                               break;
                             }
           case 12:{
          	 System.out.println("if extension required press 'y' else press 'n'");
          	  ca33 myprogram = new ca33();
                
               int x=myprogram.start();

              
          	  
          	   System.out.println("*-------------------------------------------------------------------------------------------*\n");
                         System.out.println("                                        TRIP TO MANALI\n");
                         System.out.println("Hotel chosen                      = Normal Hotel");
                         
                         int y2=3+x;
                         int z2=x+2;
                         int t2=(x*700)+2999;
                         System.out.println("Extra cost per day if extended else ignore    = 'Rs 700' "); 
                         System.out.println("Total number of days of stay is               = "+ y2+"days/"+z2+"nights");
                         System.out.println("Total cost for the trip                       = "+t2); 
                         System.out.println("\n\n                                   Thank you have a nice trip\n                     enjoy your trip ");
                                                        
                                break;
                              }

           
          }break;
          case 2:
              System.out.println("Jammu Package");
          System.out.println("21. 3* Hotel 3day/2nights cost=3999\n22. Normal Hotel 3day/2nights cost=2599\n");
          System.out.println("choose the Package");
          int k=sc.nextInt();
          switch(k){
          	case 21:{
          	 System.out.println("if extension required press 'y' else press 'n'");
            
          	ca33 myprogram = new ca33();
                
              int x=myprogram.start();

              
          	  
          	   System.out.println("*-------------------------------------------------------------------------------------------*\n");
                         System.out.println("                                        TRIP TO JAMMU\n");
                         System.out.println("Hotel chosen                      = 3 Star Hotel");
                         
                         int y=3+x;
                         int z=x+2;
                         int t=(x*900)+3999;
                         System.out.println("Extra cost per day                = 'Rs 900' "); 
                         System.out.println("Total number of days of stay is   = "+ y+"days/"+z+"nights");
                         System.out.println("Total cost for the trip           = "+t); 
                         System.out.println("\n\n                                   Thank you have a nice trip\n                     enjoy your trip ");
                               
                                break;}
           case 22:{
          	 System.out.println("if extension required press 'y' else press 'n'");
          	  ca33 myprogram = new ca33();
                
               int x=myprogram.start();

              
          	  
          	   System.out.println("*-------------------------------------------------------------------------------------------*\n");
                         System.out.println("                                        TRIP TO JAMMU\n");
                         System.out.println("Hotel chosen                      = Normal Hotel");
                         
                         int y2=3+x;
                         int z2=x+2;
                         int t2=(x*650)+2599;
                         System.out.println("Extra cost per day                = 'Rs 650' "); 
                         System.out.println("Total number of days of stay is   = "+ y2+"days/"+z2+"nights");
                         System.out.println("Total cost for the trip           = "+t2); 
                         System.out.println("\n\n                                   Thank you have a nice trip\n                     enjoy your trip ");
                         
                               
                                break;

                            }}break;

      case 3:
              System.out.println("Goa Package");
          System.out.println("31. 3* Hotel 3day/2nights cost=5999\n32. Normal Hotel 3day/2nights cost=4599\n");
          System.out.println("choose the Package");
          int l=sc.nextInt();
          switch(l){
            case 31:{
             System.out.println("if extension required press 'y' else press 'n'");
            
            ca33 myprogram = new ca33();
                
              int x=myprogram.start();

              
              
               System.out.println("*-------------------------------------------------------------------------------------------*\n");
                         System.out.println("                                        TRIP TO GOA\n");
                         System.out.println("Hotel chosen                      = 3 Star Hotel");
                         
                         int y=3+x;
                         int z=x+2;
                         int t=(x*1200)+5999;
                         System.out.println("Extra cost per day                = 'Rs 1200' "); 
                         System.out.println("Total number of days of stay is   = "+ y+"days/"+z+"nights");
                         System.out.println("Total cost for the trip           = "+t); 
                         System.out.println("\n\n                                   Thank you have a nice trip\n                     enjoy your trip ");
                               
                                break;}
           case 32:{
             System.out.println("if extension required press 'y' else press 'n'");
              ca33 myprogram = new ca33();
                
               int x=myprogram.start();

              
              
               System.out.println("*-------------------------------------------------------------------------------------------*\n");
                         System.out.println("                                        TRIP TO GOA\n");
                         System.out.println("Hotel chosen                      = Normal Hotel");
                         
                         int y2=3+x;
                         int z2=x+2;
                         int t2=(x*850)+4599;
                         System.out.println("Extra cost per day                = 'Rs 850' "); 
                         System.out.println("Total number of days of stay is   = "+ y2+"days/"+z2+"nights");
                         System.out.println("Total cost for the trip           = "+t2); 
                         System.out.println("\n\n                                   Thank you have a nice trip\n                     enjoy your trip ");
                         
                               
                                break;

                            }}break;
      case 4:
              System.out.println("kanyakumari Package");
          System.out.println("41. 3* Hotel 3day/2nights cost=6999\n42. Normal Hotel 3day/2nights cost=4899\n");
          System.out.println("choose the Package");
          int m=sc.nextInt();
          switch(m){
            case 41:{
             System.out.println("if extension required press 'y' else press 'n'");
            
            ca33 myprogram = new ca33();
                
              int x=myprogram.start();

              
              
               System.out.println("*-------------------------------------------------------------------------------------------*\n");
                         System.out.println("                                        TRIP TO kanyakumari\n");
                         System.out.println("Hotel chosen                      = 3 Star Hotel");
                         
                         int y=3+x;
                         int z=x+2;
                         int t=(x*1200)+6999;
                         System.out.println("Extra cost per day                = 'Rs 1200' "); 
                         System.out.println("Total number of days of stay is   = "+ y+"days/"+z+"nights");
                         System.out.println("Total cost for the trip           = "+t); 
                         System.out.println("\n\n                                   Thank you have a nice trip\n                     enjoy your trip ");
                               
                                break;}
           case 42:{
             System.out.println("if extension required press 'y' else press 'n'");
              ca33 myprogram = new ca33();
                
               int x=myprogram.start();

              
              
               System.out.println("*-------------------------------------------------------------------------------------------*\n");
                         System.out.println("                                        TRIP TO kanyakumari\n");
                         System.out.println("Hotel chosen                      = Normal Hotel");
                         
                         int y2=3+x;
                         int z2=x+2;
                         int t2=(x*650)+4899;
                         System.out.println("Extra cost per day                = 'Rs 650' "); 
                         System.out.println("Total number of days of stay is   = "+ y2+"days/"+z2+"nights");
                         System.out.println("Total cost for the trip           = "+t2); 
                         System.out.println("\n\n                                   Thank you have a nice trip\n                     enjoy your trip ");
                         
                               
                                break;

                            }}break;

      case 5:
      System.out.println("Thank you");
      break; 





      }


 

     }
 }
