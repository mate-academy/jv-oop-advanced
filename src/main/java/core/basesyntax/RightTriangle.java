package core.basesyntax;

public class RightTriangle extends Figure {
    private int side1;
    private int side2;
    private double hypotenuse;

    public RightTriangle(int side1, int side2, Color color) {
        super(side1 * side2 / 2, color);
        this.side1 = side1;
        this.side2 = side2;
        setHypotenuse();
    }

    private void setHypotenuse() {
        hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
    }

    public void printInfo() {
        System.out.println("Shape: right triangle, area: " + getArea() + " sq. units, hypotenuse: "
                + hypotenuse + " units, color: " + getColor());
    }
}
