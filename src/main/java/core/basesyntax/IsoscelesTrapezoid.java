package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int parallelSide;

    public IsoscelesTrapezoid(Colors color, int uniLength) {
        super(color);
        this.parallelSide = uniLength;
    }

    @Override
    public void obtainArea() {
        double sideA = parallelSide / 2;
        double sideB = parallelSide * 1.5;
        double semiPerimeterOfTrapezoid = (sideA + sideB + (parallelSide * 2)) / 2;
        double area = Math.sqrt((semiPerimeterOfTrapezoid - sideA)
                * (semiPerimeterOfTrapezoid - sideB)
                * Math.pow((semiPerimeterOfTrapezoid - parallelSide), 2));
        setArea(area);
    }

    @Override
    public String draw() {
        String figureInfo = "Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, parallelSide length: " + getParallelSide()
                + " units, color: " + getColor();

        return figureInfo;
    }

    public int getParallelSide() {
        return parallelSide;
    }
}
