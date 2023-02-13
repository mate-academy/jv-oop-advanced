package core.basesyntax;

import core.basesyntax.enums.NameOfFigure;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color, NameOfFigure.RECTANGLE.name());
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: " + getName() + ", площа: " + calculateArea()
                + " квадратних одиниць, " + "сторона1: " + firstLeg + " колір: "
                + getColor() + ", сторона2: " + secondLeg);
    }
}
