package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements IAreaCalculator {
    private double side;

    public Square(String name, String color) {
        super(name, color);
        this.side = getRandomSide();
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor() + ".");
    }

    @Override
    public int getRandomSide() {
        int side = new Random().nextInt(100);
        return side;
    }
}
