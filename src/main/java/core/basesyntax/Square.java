package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double areaOfFigure() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure-> " + getClass().getSimpleName()
                            + "\nArea of figure-> " + areaOfFigure()
                            + "\nColor-> " + getColor()
                            + "\nSide-> " + getSide());
    }
}
