package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure implements GetArea {
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();
    private int sideA;
    private int sideB;

    public Rectangle() {
        setName("rectangle");
        setColor(color.getRandomColor().toString());
        this.sideA = random.nextInt(100);
        this.sideB = random.nextInt(100);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, color: " + getColor().toLowerCase();
    }
}
