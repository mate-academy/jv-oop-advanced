package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String name, String color, int side) {
        super(color, name);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + (int) getArea() + " sq. units, side length: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
