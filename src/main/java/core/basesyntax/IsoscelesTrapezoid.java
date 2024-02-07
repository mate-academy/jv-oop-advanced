package core.basesyntax;

import core.basesyntax.enums.FigureType;

public class IsoscelesTrapezoid extends Figure {
    private final double firstLeg;
    private final double secondLeg;
    private final double height;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color, FigureType.TRAPEZOID.name());
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (firstLeg + secondLeg) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: " + getName() + ", площа: " + calculateArea()
                + " квадратних одиниць, " + "основа: " + firstLeg
                + ", основа: " + secondLeg + ", висота: " + height + " колір: " + getColor());
    }
}
