package core.basesyntax;

import core.basesyntax.enums.NameOfFigure;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color, NameOfFigure.RECTANGLE.toString());
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Фігура: " + getName() + ", площа: " + getArea()
                + " квадратних одиниць, " + "сторона1: " + firstLeg + " колір: "
                + getColor() + ", сторона2: " + secondLeg);
    }
}
