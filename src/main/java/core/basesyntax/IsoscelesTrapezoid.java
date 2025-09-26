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
        area = (horizontalSide + verticalSide) * (float) (height / 2);
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: " + area + " sq. units, horizontal side: "
                + horizontalSide + " sq. units, vertical side: "
                + verticalSide + " units, height: "
                + height + " color: " + color;
    }
}
