package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color, String name) {
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
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + getArea() + " sq. units, side length: " + getSide()
                + " units, color: " + getColor());
    }
}
