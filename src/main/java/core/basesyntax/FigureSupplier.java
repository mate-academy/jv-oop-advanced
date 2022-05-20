package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int RADIUS = 10;
    public static final String COLOR = "WHITE";
    public static final int MAX_SIDE = 9;
    public static final int FIGURE_COUNT = 5;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        int randomNum = random.nextInt(MAX_SIDE);
        Figure figure = new Figure();
        switch (index) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(), randomNum);
                break;
            case 1:
                figure = new Square(colorSupplier.getRandomColor(), randomNum);
                break;
            case 2:
                figure = new Rectangle(colorSupplier.getRandomColor(), randomNum, randomNum);
                break;
            case 3:
                figure = new RightTriangle(colorSupplier.getRandomColor(), randomNum, randomNum);
                break;
            case 4:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomNum, randomNum, randomNum);
                break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(COLOR, RADIUS);
        return figure;
    }
}
