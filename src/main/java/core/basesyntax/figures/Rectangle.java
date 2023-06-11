package core.basesyntax.figures;

import core.basesyntax.dataprocessor.ColorSupplier;

public class Rectangle extends Figure {
    private final int length;
    private final int weight;

    public Rectangle(String color, int length, int weight) {
        super(color);
        this.length = length;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public double area() {
        return getLength() * getWeight();
    }

    @Override
    public void draw() {
        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println("Figure: rectangle, area: " + area() + " sq.unit, length: "
                + getLength() + " units, weight: " + getWeight()
                + " units, color: " + colorSupplier.getRandomColor());
    }
}
