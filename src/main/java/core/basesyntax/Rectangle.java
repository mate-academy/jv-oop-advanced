package core.basesyntax;

public class Rectangle extends Figures {
    int side1;
    int side2;

    public Rectangle(int side1, int side2, String color) {
        super(Math.sqrt(side1 * side1 + side2 * side2), color);
        this.side1 = side1;
        this.side2 = side2;
        setArea(side1 * side2);
    }

    @Override
    public void print() {
        System.out.println("Shape: rectangle, area: " + getArea() + " sq. units, diagonal length: "
                + getUniqueParameter() + " units, color: " + getColor());
    }
}
