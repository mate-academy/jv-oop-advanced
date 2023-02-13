package core.basesyntax;

import core.basesyntax.enums.NameOfFigure;

public class Square extends Figure {
    private final double leg;

    public Square(String color, double leg) {
        super(color, NameOfFigure.SQUARE.name());
        this.leg = leg;
    }

    @Override
    public double calculateArea() {
        return leg * leg;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: " + getName() + ", площа: " + calculateArea()
                + " квадратних одиниць, " + "сторона: " + leg + " колір: " + getColor());
    }
}
