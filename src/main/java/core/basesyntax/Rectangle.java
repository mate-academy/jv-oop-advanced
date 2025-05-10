package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void printInfo() {
        System.out.println(getColor() + " rectangle with length: " + getLength() + ", width: "
                + getWidth() + " and area: " + getArea() + " ПТН ПНХ");
    }
}
