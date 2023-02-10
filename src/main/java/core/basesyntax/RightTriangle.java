package core.basesyntax;

public class RightTriangle extends Figure {
    private final int side;
    private final int height;
    private final FigureType figureType = FigureType.RIGHTTRIANGLE;

    public RightTriangle(String color, int side, int height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public int getHeight() {
        return height;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    @Override
    public int getArea() {
        return side * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType()
                + ", area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
