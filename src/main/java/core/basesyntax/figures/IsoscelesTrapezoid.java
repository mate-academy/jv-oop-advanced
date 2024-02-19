package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstBase;
    private double secondBase;

    public IsoscelesTrapezoid(String color, double height, double firstBase, double secondBase) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double calculateArea() {
        return (firstBase * secondBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + calculateArea() + " sq. units, height: "
                + height + " units, firstBase: "
                + firstBase + " units, secondBase: "
                + secondBase + " units, color: "
                + getColor().toLowerCase());
    }
}
