package core.basesyntax;

import java.util.EnumSet;
import java.util.Random;

public class FigureSupplier {

    private static final int MAX_RANDOM_VALUE = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomInt = random.nextInt(5);
        Figure randomFigure;
        switch (randomInt) {
            case 0:
                randomFigure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE));
                break;
            case 1:
                randomFigure = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE));
                break;
            case 2:
                randomFigure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MAX_RANDOM_VALUE),
                        random.nextDouble(MAX_RANDOM_VALUE));
                break;
            case 3:
                randomFigure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(MAX_RANDOM_VALUE),
                        random.nextDouble(MAX_RANDOM_VALUE),
                        random.nextDouble(MAX_RANDOM_VALUE));
                break;
            default:
                randomFigure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MAX_RANDOM_VALUE),
                        random.nextDouble(MAX_RANDOM_VALUE));
                break;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), 10);
    }
}
