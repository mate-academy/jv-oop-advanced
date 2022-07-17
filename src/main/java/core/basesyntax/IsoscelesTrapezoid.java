package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height, String figureColor) {
        super(figureColor);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public double getArea() {
        double area = (double) (firstBase + secondBase) / 2 * height;
        return area;
    }

    public void drawInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, firstBase: " + firstBase + ", secondBase: "
                + secondBase + ", height: " + height + ", color: " + getFigureColor());
    }

}
