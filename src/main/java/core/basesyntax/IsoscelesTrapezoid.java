package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends  Figure implements FigureArea, Draw {
    private int topBase;
    private int bottomBase;
    private int height;
    Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public IsoscelesTrapezoid(String color, int topBase, int bottomBase, int height) {
        super(color);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }
    public IsoscelesTrapezoid() {

    }

    @Override
    public double getArea() {
        return ((topBase*bottomBase)/2)*height;
    }

    @Override
    public String toString() {
        return getDraw();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public Figure getRandomFigure() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(10), random.nextInt(10), random.nextInt(10));
    }

    @Override
    public String getDraw() {
        return "IsoscelesTrapezoid: area: " +
                getArea() +
                " sq.units, "  +
                "topBase: " + topBase +
                " units, " +
                "bottomBase: " + bottomBase +
                " units, " +
                "height: " + height +
                " units, " +
                "color: " + getColor();
    }
}
