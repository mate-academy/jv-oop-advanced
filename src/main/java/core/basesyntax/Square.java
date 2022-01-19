package core.basesyntax;

public class Square extends Figures {
    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public void print() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor());
    }
}
