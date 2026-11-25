package core.basesyntax;

public class RightTriangle extends Figure implements Drawable, AreaCalculator {
    private int base;
    private int height;
    private static final double HALF = 0.5;

    RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public double getArea() {
        return  HALF * base * height;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Right Triangle, area: " + getArea()
                + " sq. units, firstLeg: " + base + " , secondLeg: " + height + " units, color: " + getColor());
    }
}
