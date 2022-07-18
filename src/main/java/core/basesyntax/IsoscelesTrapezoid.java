package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height, String color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public double getArea() {
        return (double) (firstBase + secondBase) / 2 * height;
    }

    public void drawInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, firstBase: " + firstBase + ", secondBase: "
                + secondBase + ", height: " + height + ", color: " + getFigureColor());
    }

}
