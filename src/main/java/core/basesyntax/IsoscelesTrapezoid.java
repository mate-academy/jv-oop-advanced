package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int horizontalSide;
    private final int verticalSide;
    private final int height;

    public IsoscelesTrapezoid(int horizontalSide, int verticalSide, int height, String color) {
        this.horizontalSide = horizontalSide;
        this.verticalSide = verticalSide;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, horizontal side: "
                + horizontalSide + " units, vertical side: "
                + verticalSide + " units, height: "
                + height + " color: " + color);
    }

    @Override
    protected float getArea() {
        return (horizontalSide + verticalSide) * (float) height / 2f;
    }
}
