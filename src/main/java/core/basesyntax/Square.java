package core.basesyntax;

import core.basesyntax.enums.NameOfFigure;

public class Square extends Figure {
    private final double leg;

    public Square(String color, double leg) {
        super(color, NameOfFigure.SQUARE.toString());
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return leg * leg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Фігура: " + getName() + ", площа: " + getArea()
                + " квадратних одиниць, " + "сторона: " + leg + " колір: " + getColor());
    }
}
