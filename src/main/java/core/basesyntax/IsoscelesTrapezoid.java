package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double downside;
    private double lateralSide;

    public IsoscelesTrapezoid(String color, double topSide, double downside, double lateralSide) {
        super(color);
        this.topSide = topSide;
        this.downside = downside;
        this.lateralSide = lateralSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, topside: " + topSide + " units, downside: "
                + downside + " units, lateralside: "
                + lateralSide + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        double s = 0.5 * (topSide + downside + 2 * lateralSide);
        return Math.sqrt((s - topSide) * (s - downside) * Math.pow((s - lateralSide), 2));
    }
}
