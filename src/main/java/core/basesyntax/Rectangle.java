package core.basesyntax;

public class Rectangle extends Figure {

    private double width;
    private double heigth;

    public Rectangle(String color, double width, double height) {
        super(color.toString());
        this.width = width;
        this.heigth = height;

    }

    @Override
    public void draw() {
        System.out.print("Figure:" + "Rectangle," + "Area:");
        System.out.println(getArea() + ",Color : " + getColor());
        System.out.print("Figure:" + "rectangle," + "area:" + getArea() + "sq. units ");
        System.out.println("width: " + this.width + "units," + "height: ");
        System.out.println(this.heigth + "units," + "Color:" + getColor());
    }

    @Override
    public double getArea() {
        return width * heigth;
    }
}
