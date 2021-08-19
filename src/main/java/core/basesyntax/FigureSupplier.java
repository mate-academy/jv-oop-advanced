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
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;
        return figureNumber;
    }

    private int getRandom20() {
        int figureParameter = random.nextInt(FIGURE_PARAMETER) + 1;
        return figureParameter;
    }

    private Circle generateCircle() {
        ColorSupplier newColor = new ColorSupplier();
        Circle outCircle = new Circle(getRandom20(), newColor.getRandomColor());
        return outCircle;
    }

    private IsoscelesTrapezoid generateTrapezoid() {
        ColorSupplier newColor = new ColorSupplier();
        IsoscelesTrapezoid outFigure =
                new IsoscelesTrapezoid(getRandom20(), getRandom20(),
                        getRandom20(), newColor.getRandomColor());
        return outFigure;
    }

    private Square generateSquare() {
        ColorSupplier newColor = new ColorSupplier();
        Square outFigure =
                new Square(getRandom20(), newColor.getRandomColor());
        return outFigure;
    }

    private RightTriangle generateRightTriangle() {
        ColorSupplier newColor = new ColorSupplier();
        RightTriangle outFigure =
                new RightTriangle(getRandom20(), getRandom20(), newColor.getRandomColor());
        return outFigure;
    }

    private Rectangle generateRectangle() {
        ColorSupplier newColor = new ColorSupplier();
        Rectangle outFigure =
                new Rectangle(getRandom20(), getRandom20(), newColor.getRandomColor());
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
