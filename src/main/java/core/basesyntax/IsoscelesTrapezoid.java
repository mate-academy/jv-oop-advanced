package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstBase;
    private int secondBase;

    public IsoscelesTrapezoid(int height, int firstBase, int secondBase, String color) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return Math.round((height / 2.0) * (firstBase + secondBase));
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, side height: " + height + " units, color: " + getColor());
    }
}
