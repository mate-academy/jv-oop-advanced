package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + color);
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
