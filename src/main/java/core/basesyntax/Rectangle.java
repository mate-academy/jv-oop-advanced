package core.basesyntax;

import core.basesyntax.behavior.Draw;

public class Rectangle extends  Figure implements Draw, AreaCalculater {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        area();
    }

    @Override
    public Figure draw() {

        return null;
    }

    @Override
    public void area() {
      this.area = firstSide * secondSide;
    }
}
