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
    public double findArea() {
        return (double) side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + FigureName.SQUARE.name()
                + ", area: "
                + findArea()
                + " sq. units, color: "
                + getColor()
                + ", side: "
                + side);
    }
}
