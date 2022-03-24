package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String colors) {
        super(colors);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawingField() {
        System.out.println("Figure: isosceles square, "
                + getArea()
                + " sq. units, side: "
                + side
                + " units, color: "
                + getColors());
    }
}
