package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUM = 5; //FIGURE_NUM - number of figure subclasses
    private static final int MAX_RANDOM = 9;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        int randomFigure = random.nextInt(FIGURE_NUM);

        switch (randomFigure) {
            case 0:
                figure = new Square(getRandomSide(), colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(getRandomSide(), getRandomSide(),
                        colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(getRandomSide(), getRandomSide(),
                        colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new IsoscelesTrapezoid(getRandomSide(), getRandomSide(),
                        getRandomSide(), colorSupplier.getRandomColor());
                break;
            default:
                figure = new Circle(getRandomSide(), colorSupplier.getRandomColor());
                break;
        }

        return figure;
    }

    private int getRandomSide() {
        return random.nextInt(MAX_RANDOM) + 1;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
