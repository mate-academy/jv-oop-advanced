package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstCat;
    private final int secondCat;

    public RightTriangle(int firstCat, int secondCat) {
        this.firstCat = firstCat;
        this.secondCat = secondCat;
    }

    @Override
    public double getArea() {
        return firstCat * secondCat / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle area: " + getArea()
                + " sq.units, cat: " + firstCat
                + " units, cat: " + secondCat + " units color: " + getColor());
    }
}
