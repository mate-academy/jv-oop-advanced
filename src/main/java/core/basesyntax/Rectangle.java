package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure implements IAreaCalculator, IRandomSide {
    private double shortSide;
    private double longSide;

    public Rectangle(String name, String color) {
        super(name, color);
        this.shortSide = getRandomSide();
        this.longSide = getRandomSide();
    }

    @Override
    public double getArea() {
        return shortSide * longSide;
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                + "area: " + String.format("%.2f", getArea()) + " sq.units, "
                + "shortSide: " + shortSide + " units, "
                + "longSide: " + longSide + " units, "
                + "color: " + getColor() + ".");
    }
    @Override
    public int getRandomSide() {
        int side = new Random().nextInt(100);
        return side;
    }
}
