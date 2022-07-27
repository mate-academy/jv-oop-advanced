package core.basesyntax;

public class RightTriangle extends Figure {
    private double baseLeg;
    private double heightLeg;

    public RightTriangle(String color, double baseLeg, double heightLeg) {
        super(color);
        this.baseLeg = baseLeg;
        this.heightLeg = heightLeg;
    }

    public double getFirstLeg() {
        return baseLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.baseLeg = firstLeg;
    }

    public double getHeightLeg() {
        return heightLeg;
    }

    public void setHeightLeg(double heightLeg) {
        this.heightLeg = heightLeg;
    }

    @Override
    public double getArea() {
        return (baseLeg * heightLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle , area: " + getArea()
                + ", baseLeg: " + baseLeg + ", heightLeg: " + heightLeg
                + ", color: " + getColor());
    }
}
