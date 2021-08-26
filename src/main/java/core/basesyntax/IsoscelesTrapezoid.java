package core.basesyntax;

import java.awt.Color;

public class IsoscelesTrapezoid extends Figure {
    private final int parallelOne;
    private final int parallelTwo;
    private final int height;

    public IsoscelesTrapezoid(int parallelOne, int parallelTwo,
                              int height, Color color, FigureTypes name) {
        this.parallelOne = parallelOne;
        this.parallelTwo = parallelTwo;
        this.height = height;
        super.setName(name);
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return ((parallelOne + parallelTwo) / 2) * height;
    }

    @Override
    public void draw() {
        StringBuilder trapezoidBuilder = new StringBuilder();
        trapezoidBuilder
                .append("Figure: ")
                .append(FigureTypes.ISOSCELESTRAPEZOID)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, parallelSide1: ")
                .append(parallelOne)
                .append(" units, ParallelSide2: ")
                .append(parallelTwo)
                .append(" units, height: ")
                .append(height)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(trapezoidBuilder);
    }
}
