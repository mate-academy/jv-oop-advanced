package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double high;
    private double side;

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + " area: " + this.getRadiusArea() + " hight "
                + getHigh() + " side " + getSide() + ", color: "
                + getColor());
    }

    @Override
    public double getRadiusArea() {
        return (high * side) / 2;
    }
}
