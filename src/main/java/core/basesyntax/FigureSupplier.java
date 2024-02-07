package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS_OF_CIRCLE = 10;
    private static final String DEFAULT_COLOR_OF_CIRCLE = "WHITE";
    private static final int MAX_RANDOM_VALUE = 10;
    private static final int COUNT_OF_FIGURES = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomInt = random.nextInt(COUNT_OF_FIGURES);
        Figure randomFigure;
        switch (randomInt) {
            case 0 :
                randomFigure = new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_VALUE),
                                                        random.nextInt(MAX_RANDOM_VALUE),
                                                        random.nextInt(MAX_RANDOM_VALUE),
                                                        randomColor);
                break;
            case 1 :
                randomFigure = new Rectangle(random.nextInt(MAX_RANDOM_VALUE),
                                            random.nextInt(MAX_RANDOM_VALUE),
                                            randomColor);
                break;
            case 2 :
                randomFigure = new RightTriangle(random.nextInt(MAX_RANDOM_VALUE),
                                                random.nextInt(MAX_RANDOM_VALUE),
                                                randomColor);
                break;
            case 3 :
                randomFigure = new Square(random.nextInt(MAX_RANDOM_VALUE), randomColor);
                break;
            default:
                randomFigure = new Circle(random.nextInt(MAX_RANDOM_VALUE), randomColor);
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS_OF_CIRCLE,
                            DEFAULT_COLOR_OF_CIRCLE);
    }
}
