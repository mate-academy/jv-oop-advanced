package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
        super.setArea(side * side);

    }

    @Override
    public void print() {
        super.print();
        System.out.println("side: " + side + " units, "
                + "area: " + getArea() + " square units");
    }
}
