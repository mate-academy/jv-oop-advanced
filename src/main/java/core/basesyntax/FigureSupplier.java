package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 4;
    private static final int MAX_NUMBER = 20;
    private static final ColorSupplier RANDOM_COLOR = new ColorSupplier();
    private static final Random RANDOM_NUMBER = new Random();

    public Figure getRandomFigure() {
        Figure randomFigure;
        switch(getRandomNumberOfFigure()){
            case 0:
                randomFigure = new Circle(RANDOM_COLOR.getRandomColor(), getRandomParameter());
                break;
            case 1:
                randomFigure = new IsoscelesTrapezoid(RANDOM_COLOR.getRandomColor(),
                        getRandomParameter(), getRandomParameter(), getRandomParameter());
                break;
            case 2:
                randomFigure = new Rectangle(RANDOM_COLOR.getRandomColor(),
                        getRandomParameter(), getRandomParameter());
                break;
            case 3:
                randomFigure = new RightTriangle(RANDOM_COLOR.getRandomColor(),
                        getRandomParameter(), getRandomParameter());
                break;
            default:
                randomFigure = new Square(RANDOM_COLOR.getRandomColor(), getRandomParameter());
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.getTitle(), 10);
    }

    public int getRandomParameter() {
        return RANDOM_NUMBER.nextInt(MAX_NUMBER);
    }

    public int getRandomNumberOfFigure() {
        return RANDOM_NUMBER.nextInt(NUMBER_OF_FIGURES);
    }
}
