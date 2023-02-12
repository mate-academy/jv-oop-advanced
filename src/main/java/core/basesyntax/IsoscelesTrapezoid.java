package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(Colors color, int topSide, int bottomSide, int height) {
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) ((topSide + bottomSide) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle" + ", color: " + getColor()
                + ", top side: " + topSide
                + ", bottom side: " + bottomSide
                + ", height: " + height
                + ", area: " + calculateArea());
    }
}
