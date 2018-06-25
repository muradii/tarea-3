package fundamentos.extraclass.area.perimetro;
import java.util.Scanner;

public class Rectangle {
    
    double length;
    double width;
    double area;
    double perimeter;
    
    Rectangle(){
    
    }
    
    public double getLength(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Length:" );
        length = scan.nextDouble();
        return length;
    }
    
    public double getWidth(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Width: ");
        width = scan.nextDouble();
        return width;
    }
    
    public double calcArea(){
        area = length * width; 
        System.out.println("Area is: " + area);
        return area;
    }
    
    public double calcPerimeter(){
        perimeter = (2 * width) + (2 * length);
        System.out.println("Perimeter is: " + perimeter);
        return perimeter;
    }
}

