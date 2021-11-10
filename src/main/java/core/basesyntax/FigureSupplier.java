package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final int FIGURE_PARAMETER = 20;
    private Random random = new Random();
    private String figureType;

    public String getFigureType() {
        return figureType;
    }

    private int getRandom5() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        return figureNumber;
    }

    private Circle generateCircle() {
        ColorSupplier newColorSupplier = new ColorSupplier();
        Circle outCircle = new Circle(random.nextInt(FIGURE_PARAMETER),
                newColorSupplier.getRandomColor());
        return outCircle;
    }

    private IsoscelesTrapezoid generateTrapezoid() {
        ColorSupplier newColorSupplier = new ColorSupplier();
        IsoscelesTrapezoid outFigure =
                new IsoscelesTrapezoid(random.nextInt(FIGURE_PARAMETER),
                        random.nextInt(FIGURE_PARAMETER),
                        random.nextInt(FIGURE_PARAMETER), newColorSupplier.getRandomColor());
        return outFigure;
    }

    private Square generateSquare() {
        ColorSupplier newColorSupplier = new ColorSupplier();
        Square outFigure =
                new Square(random.nextInt(FIGURE_PARAMETER), newColorSupplier.getRandomColor());
        return outFigure;
    }

    private RightTriangle generateRightTriangle() {
        ColorSupplier newColorSupplier = new ColorSupplier();
        RightTriangle outFigure =
                new RightTriangle(random.nextInt(FIGURE_PARAMETER),
                        random.nextInt(FIGURE_PARAMETER), newColorSupplier.getRandomColor());
        return outFigure;
    }

    private Rectangle generateRectangle() {
        ColorSupplier newColorSupplier = new ColorSupplier();
        Rectangle outFigure =
                new Rectangle(random.nextInt(FIGURE_PARAMETER),
                        random.nextInt(FIGURE_PARAMETER), newColorSupplier.getRandomColor());
        return outFigure;
    }

    public Figure getRandomFigure() {

        switch (getRandom5()) {
            case 1:
                return generateCircle();
            case 2:
                return generateSquare();
            case 3:
                return generateRightTriangle();
            case 4:
                return generateRectangle();
            default:
                return generateTrapezoid();
        }
    }
}
