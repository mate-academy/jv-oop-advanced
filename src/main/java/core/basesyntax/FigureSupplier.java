package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 4;
    private static final int MAX_NUMBER = 20;
    private final Random randomNumber = new Random();
    private static final ColorSupplier RANDOM_COLOR = new ColorSupplier();
    private static Figure RANDOM_FIGURE;

    public Figure getRandomFigure() {
        switch(getRandomNumberOfFigure()){
            case 0:
                RANDOM_FIGURE = new Circle(RANDOM_COLOR.getRandomColor(), getRandomParameter());
                break;
            case 1:
                RANDOM_FIGURE = new IsoscelesTrapezoid(RANDOM_COLOR.getRandomColor(),
                        getRandomParameter(), getRandomParameter(), getRandomParameter());
                break;
            case 2:
                RANDOM_FIGURE = new Rectangle(RANDOM_COLOR.getRandomColor(),
                        getRandomParameter(), getRandomParameter());
                break;
            case 3:
                RANDOM_FIGURE = new RightTriangle(RANDOM_COLOR.getRandomColor(),
                        getRandomParameter(), getRandomParameter());
                break;
            default:
                RANDOM_FIGURE = new Square(RANDOM_COLOR.getRandomColor(), getRandomParameter());
        }
    return RANDOM_FIGURE;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.getTitle(), 10);
    }

    public int getRandomParameter() {
        return randomNumber.nextInt(MAX_NUMBER);
    }

    public int getRandomNumberOfFigure() {
        return randomNumber.nextInt(NUMBER_OF_FIGURES);
    }
}
