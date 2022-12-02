package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure implements IAreaCalculator {
    private double highBase;
    private double lowBase;
    private double height;

    public IsoscelesTrapezoid(String name, String color) {
        super(name, color);
        this.highBase = getRandomSide();
        this.lowBase = getRandomSide();
        this.height = getRandomSide();
    }

    @Override
    public double getArea() {
        return (highBase + lowBase) * height / 2;
    }

    @Override
    public void getDrawing() {
        System.out.println("Figure: " + getName() + " , "
                            + "area: " + getArea() + " sq.units, "
                            + "highBase: " + highBase + " units, "
                            + "lowBase: " + lowBase + " units, "
                            + "height: " + height + " units, "
                            + "color: " + getColor() + ".");
    }

    @Override
    public int getRandomSide() {
        int side = new Random().nextInt(100);
        return side;
    }
}
