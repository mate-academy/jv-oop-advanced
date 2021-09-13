package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure implements AreaCalculator, FigureDraw{
    private int sideA;
    private int sideB;

    public Rectangle() {
        this.color = new ColorSupplier().getRandomColor();
        this.sideA = new Random().nextInt(10) + 1;
        this.sideB = new Random().nextInt(10) + 1;
    }

    @Override
    public double getArea() {
        return (double) sideA * sideB;
    }

    @Override
    public void Draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: " + sideB + " units, color: " + color);
    }
}
