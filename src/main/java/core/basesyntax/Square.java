package core.basesyntax;

public class Square extends Figure {
    private int side;
    private double diagonal;

    public Square(int side, Color color) {
        super(side * side, color);
        this.side = side;
        setDiagonal();
    }

    private void setDiagonal() {
        diagonal = Math.sqrt(2) * side;
    }

    public void printInfo() {
        System.out.println("Shape: square, area: " + getArea() + " sq. units, diagonal: "
                + diagonal + " units, color: " + getColor());
    }
}
