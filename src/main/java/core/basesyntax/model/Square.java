package core.basesyntax.model;

public class Square extends Figure {
    private final double figureSideSize;

    public Square(double figureSideSize, String color) {
        this.figureSideSize = figureSideSize;
        setColor(color);
    }

    @Override
    public double getArea() {
        return figureSideSize * figureSideSize;
    }

    @Override
    public void draw() {
        System.out.format("Figure: Square, area: %.1f sq. units, "
                        + "side size: %.1f sq. units, color: %s \n",
                getArea(), figureSideSize, getColor());
    }
}
