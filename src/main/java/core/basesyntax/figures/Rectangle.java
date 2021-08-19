package core.basesyntax.figures;

import core.basesyntax.services.AreaCalculator;
import core.basesyntax.services.ColorSupplier;

public class Rectangle extends Figure implements AreaCalculator {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        super.setColor(draw());
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public String draw() {
        return new ColorSupplier().getRandomColor();
    }
}
