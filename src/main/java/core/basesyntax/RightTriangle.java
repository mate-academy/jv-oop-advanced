package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int side;

    public RightTriangle(Color color, int height, int side) {
        super(0.5 * height * side, color);
        this.height = height;
        this.side = side;
    }

    public int getSide(){
        return this.side;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: right rectangle, area: " + getArea() + " sq. units, "
                + "height length: " + getHeight() + " units, "
                + "side length: " + getSide() + " units, "
                + "color = " + getColor());
    }
}
