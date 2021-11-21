package core.basesyntax;

import java.util.Random;

public class Trapezoid extends Figure implements AreaCalculator, Drawable {
    private int height;
    private int top;
    private int base;
    String name = "isosceles trapezoid";
    private final Random random = new Random();

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColorRandomly() {
        return super.getColorRandomly();
    }

    @Override
    public double getArea() {
        return (double) getHeight() * (getTop() + getBase()) / 2;
    }

    @Override
    public double getAreaRandom() {
        int heightRandom = random.nextInt(15);
        int baseRandom = random.nextInt(35);
        int topRandom = random.nextInt(15);
        if (heightRandom == 0) {
            heightRandom = 2;
        }
        else if (baseRandom == 0) {
            baseRandom = 10;
        }
        else if (topRandom == 0) {
            topRandom = 2;
        }
        return (double) heightRandom * (topRandom + baseRandom) / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: "
                + getArea() + " sq.units, height: " + getHeight() + " units, base: "
                + getBase() + " units, top: " + getTop() + " units, color: " + getColor();
    }

    @Override
    public String drawRandom() {
        int heightRandom = random.nextInt(15);
        if (heightRandom == 0) {
            heightRandom = 2;
        }
        int baseRandom = random.nextInt(35);
        if (baseRandom == 0) {
            baseRandom = 10;
        }
        int topRandom = random.nextInt(10);
        if (topRandom == 0) {
            topRandom = 2;
        }
        final double areaRandom = (double) heightRandom * (topRandom + baseRandom) / 2;
        return "Figure: " + getName() + ", area: "
                + areaRandom + " sq.units, height: " + heightRandom + " units, base: "
                + baseRandom + " units, top: " + topRandom + " units, color: " + getColorRandomly();
    }
}
