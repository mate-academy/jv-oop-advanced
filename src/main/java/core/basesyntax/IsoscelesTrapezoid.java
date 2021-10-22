package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side;
    private int baseA;
    private int baseB;

    public IsoscelesTrapezoid(String color, int side, int baseA, int baseB) {
        super(color);
        this.side = side;
        this.baseA = baseA;
        this.baseB = baseB;
    }

    @Override
    public double calculateArea() {
        return Math.round((baseA + baseB)
                * Math.sqrt(side * side + Math.pow(Math.abs(baseB - baseA) / 2, 2)) / 2
                * 100) / 100;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, side: " + side + " units, baseA " + baseA + " units, baseB " + baseB
                + " units, color " + getColor());
    }
}
