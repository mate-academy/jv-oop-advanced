package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int sumParallelSides;

    public IsoscelesTrapezoid(int height, int sumParallelSides,String color) {
        this.height = height;
        this.sumParallelSides = sumParallelSides;
        super.setColor(color);
        setArea(calculateArea());
    }

    public double calculateArea() {
        return sumParallelSides * height / 2;
    }

    @Override
    public void getPrintInfo() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + getArea() + " sq. units,  height: "
                + height + " units, sum of the two sides:"
                + sumParallelSides + ", color: " + getColor());
    }
}
