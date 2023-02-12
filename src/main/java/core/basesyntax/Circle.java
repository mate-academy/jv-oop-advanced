package core.basesyntax;

import core.basesyntax.enums.NameOfFigure;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color, NameOfFigure.CIRCLE.toString());
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Фігура: " + getName() + ", площа: " + getArea()
                + " квадратних одиниць, " + "радіус: " + radius + " колір: " + getColor());

    }
}
