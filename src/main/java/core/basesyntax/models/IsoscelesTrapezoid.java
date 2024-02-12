package core.basesyntax.models;

public class IsoscelesTrapezoid extends Figure {
    private final int topSide;
    private final int bottomSide;
    private final int height;

    public IsoscelesTrapezoid(int topSide, int bottomSide, int height, String color) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    double getArea() {
        return (double) (height / 2) * (topSide + bottomSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + ", top side: "
                + topSide
                + ", bottom side: "
                + bottomSide
                + ", height: "
                + height
                + ", color: "
                + color);
    }
}
