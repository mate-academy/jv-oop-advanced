package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int randomMax = 50;
    private final String colorCirkle = Colors.WHITE.toString();
    private final int radiusCirkle = 10;

    public Figure getRandomFigure() {
        switch (Figures.values()[random.nextInt(Figures.values().length)]) {
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHTTRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELESTRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();

        }
    }

    private int getRandomFigureValue() {
        return random.nextInt(randomMax) + 1;
    }

    private Square getRandomSquare() {
        int side = getRandomFigureValue();
        String color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }

    private Rectangle getRandomRectangle() {
        int heigth = getRandomFigureValue();
        int width = getRandomFigureValue();
        String color = colorSupplier.getRandomColor();
        return new Rectangle(color, heigth, width);
    }

    private RightTriangle getRandomRightTriangle() {
        int side = getRandomFigureValue();
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(color, side);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int topSide = getRandomFigureValue();
        int lateralSide = getRandomFigureValue();
        int height = getRandomFigureValue();
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, topSide, lateralSide, height);
    }

    public Figure getDefaultFigure() {
        return new Circle(colorCirkle, radiusCirkle);
    }

}
