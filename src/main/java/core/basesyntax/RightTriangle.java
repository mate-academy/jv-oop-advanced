package core.basesyntax;

public class RightTriangle extends Figure {
    private int side;

    public RightTriangle(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double areaOfFigure() {
        return (Math.sqrt(3) * side * side) / 4;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure-> " + getClass().getSimpleName()
                            + "\nArea of figure-> " + areaOfFigure()
                            + "\nColor-> " + getColor()
                            + "\nSide-> " + getSide());
    }
}
