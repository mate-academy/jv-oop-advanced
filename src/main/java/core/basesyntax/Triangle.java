package core.basesyntax;

import java.util.Random;

public class Triangle extends Figure implements AreaCalculator, Drawable {
    private int height;
    private int base;
    String name = "right triangle";
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
        return (double) (getHeight() * getBase()) / 2;
    }

    @Override
    public double getAreaRandom() {
        int heightRandom = random.nextInt(15);
        int baseRandom = random.nextInt(15);
        if (heightRandom == 0) {
            heightRandom = 2;
        }
        else if (baseRandom == 0) {
            baseRandom = 2;
        }
        return (double) (heightRandom * baseRandom) / 2;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: "
                + getArea() + " sq.units, height: " + getHeight() + " units, base: "
                + getBase() + " units, color: " + getColor();
    }

    @Override
    public String drawRandom() {
        int heightRandom = random.nextInt(15);
        if (heightRandom == 0) {
            heightRandom = 2;
        }
        int baseRandom = random.nextInt(15);
        if (baseRandom == 0) {
            baseRandom = 2;
        }
        final double areaRandom = (double) (heightRandom * baseRandom) / 2;
        return "Figure: " + getName() + ", area: "
                + areaRandom + " sq.units, height: " + heightRandom + " units, base: "
                + baseRandom + " units, color: " + getColorRandomly();
    }
}
