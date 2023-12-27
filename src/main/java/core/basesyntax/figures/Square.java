package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: "
                + this.getRadiusArea() + " side " + getSide()
                + ", color: " + getColor());
    }

    @Override
    public double getRadiusArea() {
        return side * side;
    }
}
