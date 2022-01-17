package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstParallelSide;
    private int secondParallelSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstParallelSide, int secondParallelSide,
                              int height) {
        super(color);
        this.firstParallelSide = firstParallelSide;
        this.secondParallelSide = secondParallelSide;
        this.height = height;
    }

    public int getFirstParallelSide() {
        return firstParallelSide;
    }

    public void setFirstParallelSide(int firstParallelSide) {
        this.firstParallelSide = firstParallelSide;
    }

    public int getSecondParallelSide() {
        return secondParallelSide;
    }

    public void setSecondParallelSide(int secondParallelSide) {
        this.secondParallelSide = secondParallelSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstParallelSide + secondParallelSide) / 2.0 * height;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq.units, first parallel side: " + firstParallelSide
                + ", second parallel side: " + secondParallelSide + ", height: "
                + height + ", color: " + getColor().toLowerCase());
    }
}
