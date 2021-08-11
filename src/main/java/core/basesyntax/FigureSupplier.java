package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAXVALUE = 100;

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomInt = random.nextInt(5);
        ColorSupplier randomColorGenerator = new ColorSupplier();
        String randomColor = randomColorGenerator.getRandomColor();
        switch (randomInt) {
            case 0:
                return new Square(randomColor, random.nextInt(MAXVALUE));

            case 1:
                return new Rectangle(randomColor, random.nextInt(MAXVALUE),
                        random.nextInt(MAXVALUE));

            case 2:
                return new Circle(randomColor, random.nextInt(MAXVALUE));

            case 3:
                return new IsoscelesTrapezoid(randomColor, random.nextInt(MAXVALUE),
                        random.nextInt(MAXVALUE), random.nextInt(MAXVALUE));

            default:
                return new RightTriangle(randomColor,
                        random.nextInt(MAXVALUE), random.nextInt(MAXVALUE));
        }
    }
}
