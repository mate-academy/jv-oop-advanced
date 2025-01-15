package core.basesyntax;

public class Rectangle extends Figure {
    public double height;
    public double width;
    public Rectangle (String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("This figure is rectangle: color: " + color + ", heigth: " + roundToTwoDecimals(height) + ", width: " + roundToTwoDecimals(width) + ", area: " + roundToTwoDecimals(getArea()) + ".");
    }
}
