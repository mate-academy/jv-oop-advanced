package core.basesyntax;

public class Rectangle extends Figure {
    private double sizeA;
    private double sizeB;

    public Rectangle(String color, double sizeA, double sizeB) {
        super(color);
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public double getArea() {
        return sizeA * sizeB;
    }

    @Override
    public String getPrinting() {
        return "Rectangle, area: " + getArea() + " sq. units, sizeA " + sizeA
                + " units sizeB " + sizeB + " units, color: " + getColor();
    }
}
