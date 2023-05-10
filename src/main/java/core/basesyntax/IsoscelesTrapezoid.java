package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid; "
                + "area: " + getArea() + " sq.units"
                + "; sideA: " + sideA
                + "; sideB: " + sideB
                + "; height: " + height
                + "; colour: " + this.getColor()
                + ';';
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("area: " + getArea() + " sq.units");
    }
}
