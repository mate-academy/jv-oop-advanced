package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private int figureNumber = random.nextInt(FIGURE_COUNT);
    private int figureLeg = random.nextInt(10);
    private int figureLeg2 = random.nextInt(10);
    private int figureLeg3 = random.nextInt(10);

    public Figure getRandomFigure() {
        switch (figureNumber) {
            case 0:
                return new Circle(figureLeg, getRandomColor(), "circle");
            case 1:
                return new IsoscelesTrapezoid(figureLeg, figureLeg2,
                        figureLeg3, getRandomColor(), "trapezoid");
            case 2:
                return new Rectangle(figureLeg, figureLeg2, getRandomColor(), "rectangle");
            case 3:
                return new RightTriangle(figureLeg,figureLeg2, getRandomColor(),"triangle");
            default:
                return new Square(figureLeg, getRandomColor(), "square");
        }
    }

}
