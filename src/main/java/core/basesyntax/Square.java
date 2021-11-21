package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements AreaCalculator, Drawable {
    private int side;
    String name = "square";
    private final Random random = new Random();

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public String getName() {
        return name;
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
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getAreaRandom() {
        int sideRandom = random.nextInt(15);
        if (sideRandom == 0) {
            sideRandom = 2;
        }
        return sideRandom * sideRandom;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: "
                + getArea() + " sq.units, side: " + getSide()
                + " units, color: " + getColor();
    }

    @Override
    public String drawRandom() {
        int sideRandom = random.nextInt(15);
        if (sideRandom == 0) {
            sideRandom = 5;
        }
        final double areaRandom = sideRandom * sideRandom;
        return "Figure: " + getName() + ", area: "
                + areaRandom + " sq.units, side: " + sideRandom
                + " units, color: " + getColorRandomly();
    }
}
