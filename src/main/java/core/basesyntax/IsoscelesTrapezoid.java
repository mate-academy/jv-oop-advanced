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

    @Override
    public double getArea() {
        double area = (double) (height * (firstBase + secondBase)) * 0.5;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "base1: " + firstBase + " base2: " + secondBase + " height: " + height
                + ", color: " + getColor());
    }
}
