package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int DIVIDER = 2;
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / DIVIDER * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "isosceles trapezoid" + ", area: " + getArea()
                + " sq.units, firstBase: " + firstBase + " sq.units, secondBase: "
                + secondBase + " units, color: " + getColor().toLowerCase());
    }
}
