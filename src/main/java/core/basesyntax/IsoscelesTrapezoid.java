package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int sumParallelSides;

    public IsoscelesTrapezoid(int height, int sumParallelSides,String color) {
        super(color);
        this.height = height;
        this.sumParallelSides = sumParallelSides;
    }

    public double calculateArea() {
        return sumParallelSides * height / 2;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + calculateArea() + " sq. units,  height: "
                + height + " units, sum of the two sides:"
                + sumParallelSides + ", color: " + getColor());
    }
}
