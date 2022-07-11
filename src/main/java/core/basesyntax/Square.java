package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.setSide(side);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + Square.class.getSimpleName().toLowerCase() + ", area: "
                + getArea() + " sq.units, side: " + getSide() + " units, color: " + getColor());
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }
}
