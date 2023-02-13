package core.basesyntax;

import core.basesyntax.enums.NameOfFigure;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color, NameOfFigure.CIRCLE.name());
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: " + getName() + ", площа: " + calculateArea()
                + " квадратних одиниць, " + "радіус: " + radius + " колір: " + getColor());

    }
}
