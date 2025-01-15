package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("This figure is rectangle: color: " + color + ", height: " + roundToTwoDecimals(height)
                + ", width: " + roundToTwoDecimals(width) + ", area: " + roundToTwoDecimals(getArea()) + ".");
    }
}
