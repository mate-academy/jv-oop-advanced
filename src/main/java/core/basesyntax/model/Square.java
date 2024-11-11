package basesyntax.model;

import core.basesyntax.service.AreaCalculator;

public class Square extends Figure implements AreaCalculator {

    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units, "
                + "side " + getSide() + " units, "
                + "color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    public double getSide() {
        return side;
    }
}
