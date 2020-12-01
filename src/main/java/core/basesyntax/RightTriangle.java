package core.basesyntax;

public class RightTriangle extends Figures {
    int side1;
    int side2;

    public RightTriangle(int side1, int side2, String color) {
        super(Math.sqrt(side1 * side1 + side2 * side2), color);
        this.side1 = side1;
        this.side2 = side2;
        setArea(side1 * side2 / 2);
    }

    @Override
    public void print() {
        System.out.println("Shape: right triangle, area: " + getArea()
                + " sq. units, hypotenuse length: " + getUniqueParameter()
                + " units, color: " + getColor());
    }
}
