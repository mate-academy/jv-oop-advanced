package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int lowerSide;
    private int topSide;
    private int height;

    public IsoscelesTrapezoid(String color, int lowerSide, int topSide, int height) {
        super(color);

        this.lowerSide = lowerSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return (double)((lowerSide + topSide) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: " + "isosceles trapezoid"
                + ", area: " + obtainArea() + " sq.units"
                + ", lower_side: " + lowerSide + " units"
                + ", top_side: " + topSide + " units"
                + ", height: " + height + " units"
                + ", color: " + super.getColor().toLowerCase();
    }

}
