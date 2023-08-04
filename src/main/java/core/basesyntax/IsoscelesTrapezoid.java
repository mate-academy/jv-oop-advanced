package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstSide;
    private int secondSide;

    public IsoscelesTrapezoid(String color, int height, int firstSide, int secondSide) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + this.getArea()
                + " sq.units, height: " + this.height + " units, first side: "
                + this.firstSide + " units, second side: " +  this.secondSide
                + " units, color: " + super.getColor().toLowerCase());
    }
}
