package core.basesyntax;

public class Rectangle extends Figure {

    private double width;
    private double heigth;

    public Rectangle(Color color, double width, double height) {
        super(color.toString());
        this.width = width;
        this.heigth = height;

    }

    @Override
    public void draw() {
        System.out.print("Figure:" + "Rectangle," + "Area:");
        System.out.println(getArea() + ",Color : " + getColor());
    }

    @Override
    public double getArea() {
        return width * heigth;
    }
}
