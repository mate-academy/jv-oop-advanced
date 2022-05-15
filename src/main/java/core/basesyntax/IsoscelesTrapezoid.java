package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int height){
        super(color);
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
    }
    @Override
    public double getArea() {
        return (topSide + bottomSide) / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("IsoscelesTrapezoid: top side = " + topSide + ", bottom side = " + bottomSide
                + ", height = " + height + ", area = " + getArea() + ", color - " + getColor());
    }
}
