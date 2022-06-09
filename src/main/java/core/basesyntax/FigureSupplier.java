package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private final int maxNumber = 100;
    private final String constantColor = "WHITE";
    private final int constantRadius = 10;

    private Figure figure;

    public Figure getRandomFigure() {

        int index = random.nextInt(FigureType.values().length);
        FigureType type = FigureType.values()[index];

        switch (type) {
            case CIRCLE:
                getRandomCircle();
                break;

            case SQUARE:
                getRandomSquare();
                break;

            case RECTANGLE:
                getRandomRectangle();
                break;

            case RIGHT_TRIANGLE:
                getRandomRightTriangle();
                break;

            default :
                getIsoscelesTrapezoid();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(constantRadius);
        defaultFigure.setColor(constantColor);
        return defaultFigure;
    }

    private void getRandomCircle() {
        figure = new Circle(random.nextInt(maxNumber) + 1);
    }

    private void getRandomSquare() {
        figure = new Square(random.nextInt(maxNumber) + 1);
    }

    private void getRandomRectangle() {
        figure = new Rectangle(random.nextInt(maxNumber) + 1, random.nextInt(maxNumber) + 1);
    }

    private void getRandomRightTriangle() {
        figure = new RightTriangle(random.nextInt(maxNumber) + 1);
    }

    private void getIsoscelesTrapezoid() {
        figure = new IsoscelesTrapezoid(random.nextInt(maxNumber) + 1,
                random.nextInt(maxNumber) + 1, random.nextInt(maxNumber) + 1);
    }
}
