package fundamentos.extraclass.area.perimetro;
import java.util.Scanner;

public class Pentagon {
    
    double side;
    double apothem;
    double area;
    double perimeter;
    
    Pentagon (){
    
    }
    
    public double getSide(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Side: " );
        side = scan.nextDouble();
        return side;
    }
    
    public double getApothem(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Apothem: ");
        apothem = scan.nextDouble();
        return apothem;
    }
    
    public double calcArea(){
        area = 1/2 * 5 * side * apothem;
        System.out.println("Area is: " + area);
        return area;
    }
    
    public double calcPerimeter(){
        perimeter = side * 5;
        System.out.println("Perimeter is: " + perimeter);
        return perimeter;
    }
}


