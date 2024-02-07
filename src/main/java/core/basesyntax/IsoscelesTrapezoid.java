package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int hight;
    private int firstSide;
    private int secondSide;

    public IsoscelesTrapezoid(String color, int hight, int firstSide, int secondSide) {
        super(color);
        this.hight = hight;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return ((firstSide + secondSide) / 2) * hight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first side " + firstSide + " units, second side: " + secondSide
                + " units, color: " + color);
    }
}
