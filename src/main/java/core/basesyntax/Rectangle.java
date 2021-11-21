package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure implements AreaCalculator, Drawable {
    private int height;
    private int width;
    String name = "rectangle";
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
        return getHeight() * getWidth();
    }

    @Override
    public double getAreaRandom() {
        int heightRandom = random.nextInt(15);
        int widthRandom = random.nextInt(20);
        if (heightRandom == 0) {
            heightRandom = 2;
        }
        else if (widthRandom == 0) {
            widthRandom = 2;
        }
        return heightRandom * widthRandom;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: "
                + getArea() + " sq.units, height: " + getHeight() + " units, width: "
                + getWidth() + " units, color: " + getColor();
    }

    @Override
    public String drawRandom() {
        int heightRandom = random.nextInt(15);
        if (heightRandom == 0) {
            heightRandom = 2;
        }
        int widthRandom = random.nextInt(20);
        if (widthRandom == 0) {
            widthRandom = 2;
        }
        final double areaRandom = heightRandom * widthRandom;
        return "Figure: " + getName() + ", area: "
                + areaRandom + " sq.units, height: " + heightRandom + " units, width: "
                + widthRandom + " units, color: " + getColorRandomly();
    }
}
