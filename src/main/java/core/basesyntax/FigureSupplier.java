package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RANDOM_LIMIT = 50;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();
    private Circle whiteCircle = new Circle("white", 10);

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        String randomColor = color.getRandomColor();
        Figure randomFigure;
        switch (figureIndex) {
            case 1: randomFigure = new Circle(randomColor, random.nextInt(RANDOM_LIMIT));
            break;
            case 2: randomFigure = new IsoscelesTrapezoid(randomColor,
                    random.nextInt(RANDOM_LIMIT), random.nextInt(RANDOM_LIMIT),
                    random.nextInt(RANDOM_LIMIT));
            break;
            case 3: randomFigure = new RightTriangle(randomColor,
                    random.nextInt(RANDOM_LIMIT), random.nextInt(RANDOM_LIMIT));
            break;
            case 4: randomFigure = new Rectangle(randomColor,
                    random.nextInt(RANDOM_LIMIT), random.nextInt(RANDOM_LIMIT));
            break;
            default: randomFigure = new Square(randomColor, random.nextInt(RANDOM_LIMIT));

        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return whiteCircle;
    }
}
