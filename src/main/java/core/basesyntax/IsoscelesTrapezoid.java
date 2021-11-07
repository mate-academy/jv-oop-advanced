package core.basesyntax;

import java.util.Locale;

public class IsoscelesTrapezoid extends Figure{
    private final int parallelSideA;
    private final int parallelSideB;
    private final int height;

    public IsoscelesTrapezoid(String color, int parallelSideA, int parallelSideB, int height) {
        super(color);
        this.parallelSideA = parallelSideA;
        this.parallelSideB = parallelSideB;
        this.height = height;
        this.figureType = FigureType.ISOSCELES_TRAPEZOID.toString().toLowerCase(Locale.ROOT);
    }

    @Override
    public double getArea() {
        return ((parallelSideA + parallelSideB) / 2.0) * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, firstParallelSide: %d units, secondParallelSide: %d units, height: %d units, color: %s%n",
                figureType,
                getArea(),
                parallelSideA,
                parallelSideB,
                height,
                color);
    }
}
