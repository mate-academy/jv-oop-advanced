package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color, String name) {
        super(color, name);
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
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq. units, side: "
                + getSide() + " units, color: " + getColor());
    }
}
