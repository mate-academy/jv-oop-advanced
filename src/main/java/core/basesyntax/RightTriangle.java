package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure implements IAreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, String color) {
        super(name, color);
        this.firstLeg = getRandomSide();
        this.secondLeg = getRandomSide();
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "color: " + getColor() + ".");
    }

    @Override
    public int getRandomSide() {
        int side = new Random().nextInt(100);
        return side;
    }
}
