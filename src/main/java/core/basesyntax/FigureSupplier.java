package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomInt = random.nextInt(5);
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
