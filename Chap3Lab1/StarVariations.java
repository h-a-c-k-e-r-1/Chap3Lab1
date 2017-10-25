import java.util.Scanner;
 
public class StarVariations
{
        public static void main(String[] args)
        {
            
            int input = 1;        //Current power of  2
            String star = "*";
            String space = " "; 
            int count = 10;
                                         //also serves as a counter for the loop
            Scanner scan = new Scanner(System.in);
 
            System.out.println("Which method would you like printed?(1, 2, 3, or 4)");
            input = scan.nextInt();
                    
            if (input == 1){
                for(int i=0; i<10; i++){
                  for(int x=0; x<count; x++){
                      System.out.print(star);
                    }
                count--;    
                System.out.println();
            }
            }
            if (input == 2){
                count = 9;
                int countTwo = 1;
                    for(int i=0; i<10; i++){
                  for(int x=0; x<count; x++){
                      System.out.print(space);
                    }
                  for(int y=0; y<countTwo; y++){
                      System.out.print(star);
                    }  
                count--;
                countTwo++;
                System.out.println();
            }
            }
            if (input == 3){
                    count = 0;
                int countTwo = 10;
                    for(int i=0; i<10; i++){
                  for(int x=0; x<count; x++){
                      System.out.print(space);
                    }
                  for(int y=0; y<countTwo; y++){
                      System.out.print(star);
                    }  
                count++;
                countTwo--;
                System.out.println();
            }
            }
            if (input == 4){
                    count = 4;
                int countTwo = 1;
                    for(int i=0; i<5; i++){
                  for(int x=0; x<count; x++){
                      System.out.print(space);
                    }
                  for(int y=0; y<countTwo; y++){
                      System.out.print(star);
                    }  
                count--;
                countTwo = countTwo + 2;
                System.out.println();
            }
                    count = 0;
                    countTwo = 9;
                    for(int i=0; i<5; i++){
                
                  for(int x=0; x<count; x++){
                      System.out.print(space);
                    }
                  for(int y=0; y<countTwo; y++){
                      System.out.print(star);
                    }  
                count++;
                countTwo = countTwo - 2;
                System.out.println();
            }
            }
        }
}