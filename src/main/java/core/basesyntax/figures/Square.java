package core.basesyntax.figures;

import core.basesyntax.services.AreaCalculator;
import core.basesyntax.services.ColorSupplier;

public class Square extends Figure implements AreaCalculator {
    private int side;

    public Square(int side) {
        this.side = side;
        super.setColor(draw());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return new ColorSupplier().getRandomColor();
    }
}
