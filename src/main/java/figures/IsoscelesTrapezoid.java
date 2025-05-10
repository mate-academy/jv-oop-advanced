package figures;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int topLeg;
    private int bottomLeg;

    public IsoscelesTrapezoid(String color, int height, int topLeg, int bottomLeg) {
        super(color);
        this.height = height;
        this.topLeg = topLeg;
        this.bottomLeg = bottomLeg;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getTopLeg() {
        return topLeg;
    }

    public void setTopLeg(int topLeg) {
        this.topLeg = topLeg;
    }

    public int getBottomLeg() {
        return bottomLeg;
    }

    public void setBottomLeg(int bottomLeg) {
        this.bottomLeg = bottomLeg;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %4.2f sq.units"
                + ", height: %2d units"
                + ", topLeg: %2d units"
                + ", bottomLeg: %2d units"
                + ", color: %s%n", getArea(), getHeight(), getTopLeg(), getBottomLeg(), getColor());
    }

    @Override
    public double getArea() {
        return height * (topLeg + bottomLeg) / 2.0;
    }
}
