package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstParallelSide;
    private double secondParallelSide;

    public IsoscelesTrapezoid(
            String color,
            double height,
            double firstParallelSide,
            double secondParallelSide
    ) {
        super(color);

        this.height = height;
        this.firstParallelSide = firstParallelSide;
        this.secondParallelSide = secondParallelSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getFirstParallelSide() {
        return firstParallelSide;
    }

    public void setFirstParallelSide(double firstParallelSide) {
        this.firstParallelSide = firstParallelSide;
    }

    public double getSecondParallelSide() {
        return secondParallelSide;
    }

    public void setSecondParallelSide(double secondParallelSide) {
        this.secondParallelSide = secondParallelSide;
    }

    @Override
    public void drawArea() {
        double area = ((this.firstParallelSide + this.secondParallelSide) / 2) * this.height;

        System.out.println("Figure: isosceles trapezoid, " + "area: " + area
                + " sq. units, height: "
                + this.height + " units, " + "first parallel side: "
                + this.firstParallelSide
                + ", second parallel side: " + this.secondParallelSide + ", color: "
                + this.getColor());
    }
}
