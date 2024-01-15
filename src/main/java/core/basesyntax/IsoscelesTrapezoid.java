package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int lowerSide;
    private int lateralSide;

    public IsoscelesTrapezoid(String color, int upperSide, int lowerSide, int lateralSide) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.lateralSide = lateralSide;
    }

    @Override
    public double getArea() {
        return ((upperSide + lowerSide) * 0.5) * Math.sqrt(Math.pow(lateralSide, 2)
                - Math.pow(lowerSide - upperSide, 2) / (double) 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapeziod, area: " + getArea()
                + ", upper side: " + upperSide
                + ", lower side: " + lowerSide
                + ", lateral side: " + lateralSide
                + ", color: " + getColor());
    }
}
