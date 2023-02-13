package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double botSide;
    private double height;

    public IsoscelesTrapezoid(double topSide, double botSide, double height, Color color) {
        super(color);
        this.botSide = topSide;
        this.topSide = botSide;
        this.height = height;
    }

    @Override
    public void draw() {

        System.out.println("Figure: isosceles trapezoid, area: "
                 + caclulateArea()
                 + " sq.units, topSide: "
                 + topSide + " units, botSide: "
                 + botSide + " units, color: "
                 + getColor());
    }

    @Override
    public double caclulateArea() {
        return ((topSide + botSide) / 2) * height;
    }
}
