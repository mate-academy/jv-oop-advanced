package core.basesyntax;

import static core.basesyntax.Name.ISOSCELES_TRAPESOID;

public class IsoscelesTrapezoid extends Figure {
    private int lowBase;
    private int topBase;
    private int hight;

    public IsoscelesTrapezoid(int lowBase, int topBase, int hight) {
        this.lowBase = lowBase;
        this.topBase = topBase;
        this.hight = hight;
        this.name = getName();
        this.area = getArea();
        this.color = getColor();
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
    public Name getName() {
        return ISOSCELES_TRAPESOID;
    }

    @Override
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
                + getLowBase() + " units, topBase : " + getLowBase() + " units, hight: "
                + getHight() + " units, color: " + getColor());
    }
}
