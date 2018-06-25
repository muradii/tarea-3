package fundamentos.extraclass.area.perimetro;
import java.util.Scanner;

public class Circle {
    
    double radius;
    double area;
    double perimeter;
    
    Circle (){
    
    }
    
    public double getRadius(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Radius: ");
        radius = scan.nextDouble();
        return radius;
    }
    
    public double calcArea(){
        area = Math.PI * (Math.pow(radius,2));
        System.out.println("Area is: " + area);
        return area;
    }
    
    public double calcPerimeter (){
        perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is: " + perimeter);
        return perimeter;
    }
    
}
