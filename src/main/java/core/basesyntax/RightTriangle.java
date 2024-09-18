package core.basesyntax;

public class RightTriangle extends Figure {

    private double height;

    public RightTriangle(Colors color, double side, double height) {
        super(color, side);
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: "
                + getArea() + "sq. units, side "
                + getSide() + " units, height " + height
                + " units, color: " + getColor().name());
    }

    @Override
    public double getArea() {
        return getSide() * 0.5 * height;
    }
}
