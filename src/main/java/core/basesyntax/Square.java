package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super.setColor(color);
        super.setName("square");
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public void drow() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "side: " + side + " units, " + "color: " + getColor());
    }
}
