package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int largerBase;
    private final int smallerBase;
    private final int side;

    public IsoscelesTrapezoid(Color color, int largerBase, int smallerBase, int side) {
        super(color);
        this.largerBase = largerBase;
        this.smallerBase = smallerBase;
        this.side = side;
    }

    @Override
    public int calculateArea() {
        int values = (largerBase - smallerBase) / 2;
        return  (int) Math.pow(side, 2) - (int) Math.pow(values, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, larger base: " + largerBase + " units, smaller  base: "
                + smallerBase + " units, side: " + side + " units, color: " + color.name());
    }
}
