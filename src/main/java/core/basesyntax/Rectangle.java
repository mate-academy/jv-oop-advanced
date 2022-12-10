package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Random random) {
        this.sideA = random.nextInt(100);
        this.sideB = random.nextInt(100);
        setColor(ColorSupplier.getRandomColor());
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void printInformation() {
        System.out.println(getStringBuilder().append(System.lineSeparator()).append(
                "This is a RECTANGLE ")
                .append(System.lineSeparator()).append("Color is ").append(getColor())
                .append(System.lineSeparator()).append("Side A = ").append(sideA)
                .append(System.lineSeparator()).append("Side B = ").append(sideB)
                .append(System.lineSeparator()).append("Area = ").append(getArea()).toString());

    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
