package core.basesyntax;

public class Square extends Figure {

    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }
    {
        setFigureType("square");
    }
    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
            System.out.println("Figure: "
                    + getFigureType() + ", area: "
                    + area() + " sq.units, side: "
                    + side + " units, color: "
                    + getColor().toString().toLowerCase());
    }
}
