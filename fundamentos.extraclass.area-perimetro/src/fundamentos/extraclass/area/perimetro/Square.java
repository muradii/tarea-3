package fundamentos.extraclass.area.perimetro;
import java.util.Scanner;

public class Square {
    
    double side;
    double area;
    double perimeter;
    
    Square(){
    
    }
    
    public double getSide(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Side: ");
        side = scan.nextDouble();
        return side;
    }
    
    public double calcArea(){
        area = Math.pow(side, 3);
        System.out.println("Area is: " + area);
        return area;
    }
    
    public double calcPerimeter(){
        perimeter = 4 * side;
        System.out.println("Perimeter is: " + perimeter);
        return perimeter;
    }
}
