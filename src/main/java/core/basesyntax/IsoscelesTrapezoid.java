package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(double height, double firstBase, double secondBase, String color) {
        super("Isosceles trapezoid", color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 4) * Math.sqrt((4 * (height * height))
                - ((firstBase - secondBase) * (firstBase - secondBase)));
    }

    @Override
    public String draw() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units, base 1 length: "
                + firstBase + " units, base 2 length: " + secondBase + " units, leg length: "
                + height + " units, color: " + getFigureColor();
    }
}
