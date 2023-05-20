package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    protected double firstBase;
    protected double secondBase;
    protected double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, String color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getFigureArea() {
        return Math.round(((firstBase + secondBase) / 2) * height);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getFigureArea()
                + " sq.units, first base: " + firstBase + " units, second base: "
                + secondBase + " units, height: " + height + " units, color: " + color);
    }
}
