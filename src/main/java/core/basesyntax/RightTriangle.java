package core.basesyntax;

import core.basesyntax.enums.FigureType;

public class RightTriangle extends Figure {
    private final double height;
    private final double hypotenuse;
    private final double leg;

    public RightTriangle(String color, double height, double hypotenuse, double leg) {
        super(color, FigureType.TRIANGLE.name());
        this.height = height;
        this.hypotenuse = hypotenuse;
        this.leg = leg;
    }

    @Override
    public double calculateArea() {
        return leg * height;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: " + getName() + ", площа: " + calculateArea()
                + " квадратних одиниць, " + "основа: " + leg
                + ", гіпотенуза: " + hypotenuse + ", висота: " + height + " колір: " + getColor());
    }

}
