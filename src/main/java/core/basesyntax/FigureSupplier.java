package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Color defaultFigureColor = Color.WHITE;
    private final int defaultFigureRadius = 10;
    private final int numberOfFigures = 5;
    private final int maxSizeParameters = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(defaultFigureColor, defaultFigureRadius);
    }

    public Figure getRandomFigure() {
        final Color randomColor = Color.valueOf(colorSupplier.getRandomColor());
        int figureType = random.nextInt(numberOfFigures);

        switch (figureType) {
            case 0:
                return new Square(randomColor, random.nextInt(maxSizeParameters));
            case 1:
                return new Rectangle(randomColor, random.nextInt(maxSizeParameters),
                        random.nextInt(maxSizeParameters));
            case 2:
                return new RightTriangle(randomColor, random.nextInt(maxSizeParameters),
                        random.nextInt(maxSizeParameters));
            case 3:
                return new Circle(randomColor, random.nextInt(maxSizeParameters));
            case 4:
                return new IsoscelesTrapezoid(randomColor, random.nextInt(maxSizeParameters),
                        random.nextInt(maxSizeParameters), random.nextInt(maxSizeParameters));
            default:
                return null;
        }
    }
}
