package fundamentos.extraclass.area.perimetro;
import java.util.Scanner;

public class IsocelesTriangle {
    
    double side;
    double base;
    double height;
    double area;
    double perimeter;
    
    IsocelesTriangle(){
    
    }
    
    public double getSide(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Side: " );
        side = scan.nextDouble();
        return side;
    }
    
    public double getBase(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Base: " );
        base = scan.nextDouble();
        return base;
    }
    
    public double getHeight(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Height: " );
        height = scan.nextDouble();
        return height;
    }
    
    public double calcArea(){
        area = (base * height) / 2;
        System.out.println("Area is: " + area);
        return area;
    }
    
    public double calcPerimeter(){
        perimeter = (2 * side) + base;
        System.out.println("Perimeter is: " + perimeter);
        return perimeter;
    }
}
