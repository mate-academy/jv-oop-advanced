package core.basesyntax.model;

import core.basesyntax.supplier.ColorSupplier;

public class Square extends Figure {
    private int side;

    public Square() {
        this.side = getRandom().nextInt(100);
        setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(getStringBuilder().append(System.lineSeparator()).append(
                "This is a SQUARE ")
                .append(System.lineSeparator()).append("Color is ").append(getColor())
                .append(System.lineSeparator()).append("Side A = ").append(side)
                .append(System.lineSeparator()).append("Area = ").append(getArea()).toString());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
