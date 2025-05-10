package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + String.format("%.1f", this.getArea())
                + " sq.units, firstSide: " + this.firstSide
                + " secondSide: " + this.secondSide + " units, color: "
                + this.color.toString().toLowerCase());
    }
}
