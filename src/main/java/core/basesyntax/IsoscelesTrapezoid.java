package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private final double upSide = new Random().nextInt(100);
    private final double downSide = new Random().nextInt(100);
    private final double height = new Random().nextInt(100);
    private final Color color = Color.values()[new Random().nextInt(10)];

    public Color getColor() {
        return color;
    }

    @Override
    public double area() {
        return ((upSide + downSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + this.area() + " sq.units, up side: "
                + getUpSide() + " units, down side: " + getDownSide() + " units, height: "
                + getHeight() + " units, color: " + getColor());
    }

    public double getUpSide() {
        return upSide;
    }

    public double getDownSide() {
        return downSide;
    }

    public double getHeight() {
        return height;
    }
}
