package core.basesyntax;

public class Square extends Figure {
    private int side;
    private double diagonal;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
        calculateArea();
        calculateDiagonal();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, diagonal: "
                + diagonal + ", sides: " + side + ", color: " + getColor());
    }

    @Override
    public void calculateArea() {
        setArea(side * side);
    }

    public void calculateDiagonal() {
        diagonal = Math.sqrt(2) * side;
    }

    public int getSide() {
        return side;
    }

    public double getDiagonal() {
        return diagonal;
    }
}
