package core.basesyntax;

public class IsoscelesTrapezoid extends AbstractFigure {
    private int firstParallelSide;
    private int secondParallelSide;
    private int height;

    public IsoscelesTrapezoid(int firstParallelSide, int secondParallelSide, int height) {
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
    public double calculateArea() {
        return (this.firstParallelSide + this.secondParallelSide) * 0.5 * this.height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + calculateArea() + " sq. units, firstParallelSide: "
                + this.firstParallelSide + " units, secondParallelSide: " + this.secondParallelSide
                + " units, height: " + this.height + " units, color: " + super.getColor());
    }
}
