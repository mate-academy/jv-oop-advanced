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
        String trapezoidInfo = "Figure: "
                + FigureTypes.ISOSCELESTRAPEZOID
                + ", area: "
                + getArea()
                + " sq.units, parallelSide1: "
                + parallelOne
                + " units, ParallelSide2: "
                + parallelTwo
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
        System.out.println(trapezoidInfo);
    }
}
