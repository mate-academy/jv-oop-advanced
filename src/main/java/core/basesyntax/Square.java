package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
    }

    public Square(int getSide, String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + getClass().getSimpleName()
                + "area: " + this.getArea() + " sq.units"
                + "side: " + side + "units"
                + "color: " + this.color);
    }
}
