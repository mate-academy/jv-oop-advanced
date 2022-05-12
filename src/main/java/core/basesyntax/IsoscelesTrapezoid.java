package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int sides;
    private int upperSide;
    private int downSide;

    public IsoscelesTrapezoid(String color, int sides, int upperSide, int downSide) {
        super(color);
        this.sides = sides;
        this.upperSide = upperSide;
        this.downSide = downSide;
    }

    @Override
    public double getArea() {
        double result = Math.sqrt(Math.pow((downSide + upperSide), 2)
                * (downSide - upperSide + 2 * sides)
                * (upperSide - downSide + 2 * sides))
                * 1 / 4;
        double scale = Math.pow(10, 1);
        return Math.ceil(result * scale) / scale;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq.units, sides: "
                + sides + " units, upperSide: "
                + upperSide + " units, downSide: "
                + downSide + " units, colors: "
                + getColor());
    }
}
