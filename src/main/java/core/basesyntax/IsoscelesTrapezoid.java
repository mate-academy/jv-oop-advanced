package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;
    private final int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.sideA + this.sideB) / 2 * this.height;
    }

    @Override
    public void draw() {
        String trapezoidInformation = String.valueOf(new StringBuilder()
                .append("Figure: isoscelesTrapezoid, area: ")
                .append(getArea())
                .append("sq.units, sideA: ")
                .append(this.sideA)
                .append("units, sideB: ")
                .append(this.sideB)
                .append(" units, height: ")
                .append(this.height)
                .append(" units, color: ")
                .append(color));
        System.out.println(trapezoidInformation);
    }
}