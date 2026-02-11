package core.basesyntax.model;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.2f, sides: %.2f, color: %s\n",
                         getArea(), getSide(), getColor());
    }
}
