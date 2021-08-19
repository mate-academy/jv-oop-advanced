package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int constNumber = 10;
    private final int randomNumberFigure = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(randomNumberFigure)) {
            case (0):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(constNumber), random.nextInt(constNumber),
                        random.nextInt(constNumber));
            case (1):
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(constNumber));
            case (2):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(constNumber), random.nextInt(constNumber));
            case (3):
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(constNumber),
                        random.nextInt(constNumber));
            default:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(constNumber));
        }
    }
}
