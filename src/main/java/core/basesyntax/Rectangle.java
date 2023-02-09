package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide, double secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + String.format("%.2f", calculateArea())
                + " sq.units, first Side: " + firstSide + " units, second Side: "
                + secondSide + " units, color: " + getColor().name());
    }
}
