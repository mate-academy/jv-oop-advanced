package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + calculateArea() + " sq.units, "
                + "side: " + getSide() + " units, "
                + "color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
