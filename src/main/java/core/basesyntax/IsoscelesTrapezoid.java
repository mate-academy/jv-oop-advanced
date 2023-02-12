package core.basesyntax;

import core.basesyntax.enums.NameOfFigure;

public class IsoscelesTrapezoid extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color, NameOfFigure.TRAPEZOID.toString());
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Фігура: " + getName() + ", площа: " + getArea()
                + " квадратних одиниць, " + "основа: " + firstLeg
                + ", основа: " + secondLeg + ", висота: " + height + " колір: " + getColor());
    }
}
