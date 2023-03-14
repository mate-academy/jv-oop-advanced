package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topLength;
    private double downLength;
    private double height;

    public IsoscelesTrapezoid(String color, double topLength, double downLength, double height) {
        super(color);
        this.topLength = topLength;
        this.downLength = downLength;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, topLength: " + getTopLength()
                + " units, downLength: " + getDownLength()
                + " units, height: " + getHeight() + " units, color: " + color);
    }

    @Override
    public Double getArea() {
        return ((getTopLength() + getDownLength()) * getHeight()) / 2;
    }

    private double getTopLength() {
        return topLength;
    }

    private double getDownLength() {
        return downLength;
    }

    private double getHeight() {
        return height;
    }
}
