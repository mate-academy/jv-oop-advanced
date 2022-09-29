package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
        this.setType("square");
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getType() + ", area: " + getArea() + " units, side: " + side
                + " units, color: " + getColor());
    }
}
