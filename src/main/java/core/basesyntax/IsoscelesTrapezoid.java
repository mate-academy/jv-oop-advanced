package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    public double height;
    public double firstParallelSide;
    public double secondParallelSide;

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

    @Override
    public void drawArea() {
        double area = ((this.firstParallelSide + this.secondParallelSide) / 2) * this.height;

        System.out.println("Figure: isosceles trapezoid, " + "area: " + area + " sq. units, height: " + this.height + " units, " +
                "first parallel side: " + this.firstParallelSide + ", second parallel side: " + this.secondParallelSide +
                ", color: " + this.color);
    }
}
