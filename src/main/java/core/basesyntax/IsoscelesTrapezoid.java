package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double downside;
    private double lateralSide;

    public IsoscelesTrapezoid(Color color, double topSide, double downside, double lateralSide) {
        super(color);
        this.topSide = topSide;
        this.downside = downside;
        this.lateralSide = lateralSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, topside: " + topSide + " units, downside: "
                + downside + " units, lateralside: "
                + lateralSide + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        final double coefficient = 0.5;
        final int powIndex = 2;
        double s = coefficient * (topSide + downside + lateralSide + lateralSide);
        return Math.sqrt((s - topSide) * (s - downside) * Math.pow((s - lateralSide), powIndex));
    }
}
