package core.basesyntax;

public class Rectangle extends Figure {
    private int side1;
    private int side2;
    private double diagonal;

    public Rectangle(int side1, int side2, Color color) {
        super(side1 * side2, color);
        this.side1 = side1;
        this.side2 = side2;
        setDiagonal();
    }

    private void setDiagonal() {
        diagonal = Math.sqrt(side1 * side1 + side2 * side2);
    }

    public void printInfo() {
        System.out.println("Shape: rectangle, area: " + getArea() + " sq. units, diagonal: "
                + diagonal + " units, color: " + getColor());
    }
}

