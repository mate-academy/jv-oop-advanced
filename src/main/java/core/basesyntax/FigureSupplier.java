package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int NUMBER_OF_CLASSES = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomInt = random.nextInt(NUMBER_OF_CLASSES);
        ColorSupplier randomColorGenerator = new ColorSupplier();
        String randomColor = randomColorGenerator.getRandomColor();
        switch (randomInt) {
            case 0:
                return new Square(randomColor, random.nextInt(MAX_VALUE));

            case 1:
                return new Rectangle(randomColor, random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));

            case 2:
                return new Circle(randomColor, random.nextInt(MAX_VALUE));

            case 3:
                return new IsoscelesTrapezoid(randomColor, random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));

            default:
                return new RightTriangle(randomColor,
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
        }
    }
}
