package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double side, String color) {
        super(color, "isosceles trapezoid");
        this.side = side;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 4) * Math.sqrt((4 * (side * side))
                - ((firstBase - secondBase) * (firstBase - secondBase)));
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units"
                + ", bottom base: " + firstBase + ", top base: " + secondBase
                + ", side: " + side + " units, color: " + getColor();
    }
}
