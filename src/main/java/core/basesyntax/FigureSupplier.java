package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int INDEX_RANDOM_LIMIT = 6;
    private static final int PROPS_RANDOM_LIMIT = 100;
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int currentIndex = random.nextInt(INDEX_RANDOM_LIMIT);
        String randomColor = colorSupplier.getRandomColor();

        if (currentIndex == 0) {
            return new Square(randomColor, random.nextInt(PROPS_RANDOM_LIMIT));
        } else if (currentIndex == 1) {
            return new Rectangle(randomColor, random.nextInt(PROPS_RANDOM_LIMIT),
                    random.nextInt(PROPS_RANDOM_LIMIT));
        } else if (currentIndex == 2) {
            return new RightTriangle(randomColor, random.nextInt(PROPS_RANDOM_LIMIT),
                    random.nextInt(PROPS_RANDOM_LIMIT));
        } else if (currentIndex == 3) {
            return new Circle(randomColor, random.nextInt(PROPS_RANDOM_LIMIT));
        } else {
            return new IsoscelesTrapezoid(randomColor, random.nextInt(PROPS_RANDOM_LIMIT),
                    random.nextInt(PROPS_RANDOM_LIMIT), random.nextInt(PROPS_RANDOM_LIMIT));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }
}
