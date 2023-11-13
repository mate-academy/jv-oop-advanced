package core.basesyntax;

import static core.basesyntax.Name.SQUARE;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
        this.name = getName();
        this.area = getArea();
        this.color = getColor();
    }

    public int getSide() {
        return side;
    }

    @Override
    public Name getName() {
        return SQUARE;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public Color getColor() {
        return new ColorSupplier().getRandomColor();
    }

    @Override
    public void describe() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, side: "
                + getSide() + " units, color: " + getColor());
    }
}
