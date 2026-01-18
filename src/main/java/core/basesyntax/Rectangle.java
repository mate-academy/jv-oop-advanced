package core.basesyntax;

public class Rectangle extends Figure implements Drowable, CalculateArea{
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("This is rectangle with length - " +
                this.length + ", width - " + this.width +
                " and color - " + this.getColor());
    }

    @Override
    public double area() {
        return length*width;
    }
}
