package core.basesyntax;

public class Rectangle extends Figure {

    private double recWidth;
    private double recLength;

    public Rectangle(String color, double recWidth, double recLength) {
        super(color);
        this.recWidth = recWidth;
        this.recLength = recLength;
    }

    public double getRecWidth() {
        return recWidth;
    }

    public double getRecLength() {
        return recLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, " + "area: " + getArea()
                           + " sq. units, width: " + getRecWidth()
                           + ", length: " + getRecLength()
                           + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return recWidth * recLength;
    }
}
