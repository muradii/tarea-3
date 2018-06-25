package fundamentos.extraclass.area.perimetro;
import java.util.Scanner;

public class EquilateralTriangle {
    
    double side;
    double area;
    double perimeter;
    
    EquilateralTriangle(){
    
    }
    
    public double getSide(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Side: ");
        side = scan.nextDouble();
        return side;
    }
    
    public double calcArea(){
        area = (Math.sqrt(3) / 4 ) * Math.pow(side , 2);
        System.out.println("Area is: " + area);
        return area;
    }
    
    public double calcPerimeter(){
        perimeter = 3 * side;
        System.out.println("Perimeter is: " + perimeter);
        return perimeter;
    }
}
