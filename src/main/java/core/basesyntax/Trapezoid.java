package core.basesyntax;

import java.util.Random;

public class Trapezoid extends Figure implements Drawable {
    private double upSide = new Random().nextInt(100);
    private double downSide = new Random().nextInt(100);
    private double height = new Random().nextInt(100);
    Color color = Color.values()[new Random().nextInt(10)];

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public double area() {
        return ((upSide + downSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + this.area() + " sq.units, up side: " + getUpSide() + " units, down side: " + getDownSide() + " units, height: " + getHeight() + " units, color: " + getColor());
    }

    public double getUpSide() {
        return upSide;
    }

    public void setUpSide(double upSide) {
        this.upSide = upSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public void setDownSide(double downSide) {
        this.downSide = downSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
