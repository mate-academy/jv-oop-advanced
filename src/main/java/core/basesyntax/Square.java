package core.basesyntax;

public class Square extends Figure implements Drawable {
    private final int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public double getAreaFigures() {
        return getArea(side * side);
    }

    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "side: " + getSide() + " units, "
                + "color: " + getColor());
    }
}
