package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private int figureNumber = random.nextInt(FIGURE_COUNT);
    private int figureLeg = random.nextInt(10);
    private int figureLeg2 = random.nextInt(10);
    private int figureLeg3 = random.nextInt(10);

    public int getFigureLeg2() {
        return figureLeg2;
    }

    public int getFigureLeg3() {
        return figureLeg3;
    }

    public int getFigureLeg() {
        return figureLeg;
    }

    public Figure getRandomFigure() {
        switch (figureNumber) {
            case 0:
                return new Circle(getFigureLeg(), getRandomColor(), "circle");
            case 1:
                return new IsoscelesTrapezoid(getFigureLeg(), getFigureLeg2(),
                        getFigureLeg3(), getRandomColor(), "trapezoid");
            case 2:
                return new Rectangle(getFigureLeg(),
                        getFigureLeg2(), getRandomColor(), "rectangle");
            case 3:
                return new RightTriangle(getFigureLeg(),
                        getFigureLeg2(), getRandomColor(),"triangle");
            default:
                return new Square(getFigureLeg(),
                        getRandomColor(), "square");
        }
    }

}
