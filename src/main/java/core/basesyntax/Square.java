package core.basesyntax;

public class Square extends Figure {
    private double lengthA;

    public Square(String color, double a) {
        super(color);
        this.lengthA = a;
    }

    @Override
    public void print() {
        System.out.println("Figure: square, area: " + calculateArea() + "sq.units, color: "
                + getColor() + ", side a: " + lengthA);
    }

    @Override
    public double calculateArea() {
        return Math.pow(lengthA, 2);
    }
}
