package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements AreaCalculator, Drawable{
    private int radius;
    String name = "circle";
    private final Random random = new Random();

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
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
        return Math.ceil(Math.PI * getRadius() * getRadius()*100)/100;
    }

    @Override
    public double getAreaRandom() {
        int radiusRandom = random.nextInt(15);
        if (radiusRandom == 0) {
            radiusRandom = 2;
        }
        return Math.ceil(Math.PI * radiusRandom * radiusRandom*100)/100;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: "
                + getArea() + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor();
    }

    @Override
    public String drawRandom() {
        int radiusRandom = random.nextInt(15);
        if (radiusRandom == 0) {
            radiusRandom = 5;
        }
        final double areaRandom =  Math.ceil(Math.PI * radiusRandom * radiusRandom*100)/100;
        return "Figure: " + getName() + ", area: "
                + areaRandom + " sq.units, radius: " + radiusRandom
                + " units, color: " + getColorRandomly();
    }
}
