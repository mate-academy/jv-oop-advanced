package core.basesyntax;

import core.basesyntax.behavior.Draw;

public class RightTriangle extends Figure implements Draw, AreaCalculater {
    private double firstSide;
    private double secondSide;
    private double hypotenuse;
    public RightTriangle(String color, double firstSide, double secondSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.hypotenuse = Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        area();


    }
    @Override
    public Figure draw() {

        return null;
    }

    @Override
    public void area() {
        this.area = 0.5 * firstSide * secondSide;
    }
}
