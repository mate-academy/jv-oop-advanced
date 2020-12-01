package core.basesyntax;

public class Square extends Figures {

    int side;

    public Square(int side, String color) {
        super(side * Math.sqrt(2.0), color);
        this.side = side;
        setArea(side * side);
    }

    @Override
    public void print() {
        System.out.println("Shape: square, area: " + getArea() + " sq. units, diagonal length: "
                + getUniqueParameter() + " units, color: " + getColor());
    }
}
