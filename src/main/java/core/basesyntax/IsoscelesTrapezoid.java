package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getAreaOfFigure() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getAreaOfFigure()
                + " sq. units, firstSide: " + firstSide + " units, secondSide: " + secondSide
                + " units, color: " + getColor());
    }
}
