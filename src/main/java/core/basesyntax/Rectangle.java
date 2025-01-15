package core.basesyntax;

public class Rectangle extends Figure {
    public void setHeight(double height) {
        this.heigth = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double heigth;

    public double getHeight() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }

    private double width;

    public Rectangle(String color, double heigth, double width) {
        super(color);
        this.heigth = heigth;
        this.width = width;
    }

    @Override
    public double getArea() {
        return heigth * width;
    }

    @Override
    public void draw() {
        System.out.println("This figure is rectangle: color: " + color + ", heigth: " + roundToTwoDecimals(heigth) + ", width: " + roundToTwoDecimals(width) + ", area: " + roundToTwoDecimals(getArea()) + ".");
    }
}
