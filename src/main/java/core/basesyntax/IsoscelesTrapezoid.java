package core.basesyntax;

import static core.basesyntax.Shape.ISOSCELES_TRAPESOID;

public class IsoscelesTrapezoid extends Figure {
    private int lowBase;
    private int topBase;
    private int hight;

    public IsoscelesTrapezoid(int lowBase, int topBase, int hight, Color color) {
        super(color);
        this.lowBase = lowBase;
        this.topBase = topBase;
        this.hight = hight;
    }

    public int getLowBase() {
        return lowBase;
    }

    public int getTopBase() {
        return topBase;
    }

    public int getHight() {
        return hight;
    }

    @Override
    public Shape getName() {
        return ISOSCELES_TRAPESOID;
    }

    public double getArea() {
        return (lowBase + topBase) / 2 * hight;
    }

    @Override
    public Color getColor() {
        return new ColorSupplier().getRandomColor();
    }

    @Override
    public void describe() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + " sq, lowBase: "
                + getLowBase() + " units, topBase : " + getTopBase() + " units, hight: "
                + getHight() + " units, color: " + getColor());
    }
}
