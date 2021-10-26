package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIDE_LENGTH = 5;

    private static final Random RANDOM = new Random();
    private static final ColorSupplier CS = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = RANDOM.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (figureNumber) {
            case 2:
                figure = new Rectangle(RANDOM.nextInt(MAX_SIDE_LENGTH),
                        RANDOM.nextInt(MAX_SIDE_LENGTH));
                break;
            case 3:
                figure = new RightTriangle(RANDOM.nextInt(MAX_SIDE_LENGTH),
                        RANDOM.nextInt(MAX_SIDE_LENGTH));
                break;
            case 4:
                figure = new Circle(RANDOM.nextInt(MAX_SIDE_LENGTH));
                break;
            case 5:
                int a = RANDOM.nextInt(MAX_SIDE_LENGTH);
                int b = RANDOM.nextInt(MAX_SIDE_LENGTH);
                int c = RANDOM.nextInt(MAX_SIDE_LENGTH);
                figure = new IsoscelesTrapezoid((a > b) ? a : b, (a > b) ? b : a, c);
                break;
            default:
                figure = new Square(RANDOM.nextInt(MAX_SIDE_LENGTH));
                break;
        }
        figure.setColor(CS.getRandomColor());

        return figure;
    }
}
