package core.basesyntax.model;

import core.basesyntax.supplier.ColorSupplier;

public class IsoscelesTrapezoid extends Figure {

    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid() {
        this.sideA = getRandom().nextInt(100);
        this.sideB = getRandom().nextInt(100);
        this.height = getRandom().nextInt(100);
        setColor(new ColorSupplier().getRandomColor());
    }

    @Override
    public double getArea() {
        if (sideA > sideB) {
            return (sideA * height) - (sideA - sideB) * height;
        } else {
            return (sideB * height) - (sideB - sideA) * height;
        }
    }

    @Override
    public void draw() {
        System.out.println(getStringBuilder().append(System.lineSeparator()).append(
                "This is a ISOSCELES TRAPEZOID ")
                .append(System.lineSeparator()).append("Color is ").append(getColor())
                .append(System.lineSeparator()).append("Side A = ").append(sideA)
                .append(System.lineSeparator()).append("Side B = ").append(sideB)
                .append(System.lineSeparator()).append("Height = ").append(height)
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
