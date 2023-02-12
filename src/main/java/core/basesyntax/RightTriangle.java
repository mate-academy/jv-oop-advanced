package core.basesyntax;

import core.basesyntax.enums.NameOfFigure;

public class RightTriangle extends Figure {
    private final double height;
    private final double hypotenuse;
    private final double leg;

    public RightTriangle(String color, double height, double hypotenuse, double leg) {
        super(color, NameOfFigure.TRIANGLE.toString());
        this.height = height;
        this.hypotenuse = hypotenuse;
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return leg * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Фігура: " + getName() + ", площа: " + getArea()
                + " квадратних одиниць, " + "основа: " + leg
                + ", гіпотенуза: " + hypotenuse + ", висота: " + height + " колір: " + getColor());
    }

}
