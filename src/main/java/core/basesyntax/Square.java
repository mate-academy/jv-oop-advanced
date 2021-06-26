package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public String draw() {
        System.out.println(("Figure: Square, area: " + getArea()
                + " sq.units, size side: " + getSide()
                + " units, color: " + getColor()));
        return null;
    }
}
