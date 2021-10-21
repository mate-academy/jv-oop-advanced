package core.basesyntax;

public class RightTriangle extends Shape implements AreaCounter {
    private int side = 0;

    RightTriangle(int side, String color) {
        super("Rectangle", color);
        this.side = side;
        float valueOfArea = countArea();
        setArea(valueOfArea);
    }

    @Override
    public float countArea() {
        return  (float) (side * side * Math.sqrt(3.0 / 4.0));
    }

    @Override
    public String toString() {
        return "RightTriangle, " + "area: " + getArea() + " sq.units" + " side: " + side
                + " units" + ", color: " + getColor();
    }
}
