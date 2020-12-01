package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final int baseA;
    private final int baseB;
    private final int side;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int side) {
        super(side * side - 1.0 / 4.0 * Math.pow((baseB - baseA), 2), color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, perimeter: "
                + getPerimeter() + " units, diagonal: "
                + getDiagonal() + " units, color: " + color);
    }

    public double getPerimeter() {
        return baseA + baseB + 2 * side;
    }

    public double getDiagonal() {
        return Math.sqrt(baseA * baseB + side * side);
    }

}
