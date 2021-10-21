package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int side;
    private int side2;

    public IsoscelesTrapezoid(int height, int side, int side2, String color) {
        this.setShape("Isosceles Trapezoid");
        this.setColor(color);
        this.height = height;
        this.side = side;
        this.side2 = side2;
    }

    public IsoscelesTrapezoid() {
        this.height = new Random().nextInt(100);
        this.side = new Random().nextInt(100);
        this.side2 = new Random().nextInt(100);
        this.setShape("Isosceles Trapezoid");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public int getArea() {
        return (side + side2) * height / 2;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: %s , area: %s sq.units, firstSide: %s units, "
                        + "secondSide: %s units, " + "height: %s units, color: %s%n",
                getShape(), getArea(), getSide(), getSide2(), getHeight(), getColor());
    }
}
