package Midterm;

public class Rectangle{
    private double width;
    private double height;
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getPerimeter(){
        return(width * 2 + height * 2);
    }
    
    public double getArea(){
        return(width * height);
    }
}