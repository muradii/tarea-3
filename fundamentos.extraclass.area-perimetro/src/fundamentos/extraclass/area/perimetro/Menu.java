package fundamentos.extraclass.area.perimetro;
import java.util.Scanner;

public class Menu {

  int i;
  int j;
  
  Menu (){
  
  }  
  
    public void printMenu (){
        System.out.println( " 1. Area  2. Perimeter  3. Quit");
        Scanner scan = new Scanner (System.in);
        i = scan.nextInt();
        System.out.println( "1. Circle  2. Square  3. Rectangle  4. Equilateral Triangle  5. Isoceles Triangle  6. Pentagon  " );
        j = scan.nextInt();
           
                
        do {
            if (i == 1 && j == 1){
                Circle c = new Circle ();
                c.getRadius();
                c.calcArea();
                printMenu ();
            } else if (i == 1 && j == 2){
                Square c = new Square ();
                c.getSide();
                c.calcArea();
                printMenu ();
            } else if (i == 1 && j == 3){
                Rectangle c = new Rectangle ();
                c.getLength();
                c.getWidth();
                c.calcArea();
                printMenu ();
            } else if (i == 1 && j == 4){
                EquilateralTriangle c = new EquilateralTriangle ();
                c.getSide();
                c.calcArea();
                printMenu ();
            } else if (i == 1 && j == 5){
                IsocelesTriangle c = new IsocelesTriangle ();
                c.getHeight();
                c.getBase();
                c.calcArea();
                printMenu ();
            } else if (i == 1 && j == 6){
                Pentagon c = new Pentagon ();
                c.getSide();
                c.getApothem();
                c.calcArea();
                printMenu ();
            } else if (i == 2 && j == 1){
                Circle c = new Circle ();
                c.getRadius();
                c.calcPerimeter();
                printMenu();
            } else if (i == 2 && j == 2){
                Square c = new Square ();
                c.getSide();
                c.calcPerimeter();
                printMenu();
            } else if (i == 2 && j == 3){
                Rectangle c = new Rectangle ();
                c.getWidth();
                c.getLength();
                c.calcPerimeter();
                printMenu();
            } else if (i == 2 && j == 4){
                EquilateralTriangle c = new EquilateralTriangle();
                c.getSide();
                c.calcPerimeter();
                printMenu();
            } else if (i == 2 && j == 5){
                IsocelesTriangle c = new IsocelesTriangle();
                c.getSide();
                c.getBase();
                c.calcPerimeter();
                printMenu();
            } else if (i == 2 && j == 6){
                Pentagon c = new Pentagon ();
                c.getSide();
                c.calcPerimeter();
                printMenu();
            }
        } while (i != 3);              
    }                
}
       
    

      
    
    
    

  
    
  

