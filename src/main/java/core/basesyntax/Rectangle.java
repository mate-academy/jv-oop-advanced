package core.basesyntax;

public class Rectangle extends Figure {
    double width;
    double height;
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override 
     public double getArea() {
        return width * height;
     }
    @Override
    public void draw() {
        System.out.println("Figure : Rectangle, area :" + getArea() + " units, width : " + width + "units, heigth :" + height + " units, color :" + color);
    }

}
