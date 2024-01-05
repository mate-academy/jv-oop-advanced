package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_NUMBER = 20;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure figure = null;
        switch (figureNumber) {
            case 1:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
                break;
            case 2:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER));
                break;
            case 3:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER));
                break;
            case 4:
                figure = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
                break;
            case 5:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER));
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
