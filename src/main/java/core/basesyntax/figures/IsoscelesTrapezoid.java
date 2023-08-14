package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, int parallelSide, int lowBase, double upperBase) {
        super(color);
        this.firstSide = parallelSide;
        this.secondSide = lowBase;
        this.height = upperBase;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("First side: %s,Second side: %s, Height: %s",
                firstSide, secondSide, height));
    }
}
