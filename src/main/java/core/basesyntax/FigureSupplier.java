package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int MAX = 200;
    public static final int COUNT = 5;

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        Random random = new Random();
        int switchNumber = random.nextInt(COUNT);
        switch (switchNumber) {
            case 1:
                return new Rectangle("Rectangle", colorSupplier.getNewColor(), random.nextInt(MAX),
                        random.nextInt(MAX));
            case 2:
                return new Square("Square", colorSupplier.getNewColor(),random.nextInt(MAX));
            case 3:
                return new RightTrieangle("RightTrieangle", colorSupplier.getNewColor(),
                           random.nextInt(MAX), random.nextInt(MAX));
            case 4:
                return new Circle("Circle", colorSupplier.getNewColor(), random.nextInt(MAX));
            default:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", colorSupplier.getNewColor(),
                           random.nextInt(MAX), random.nextInt(MAX), random.nextInt(MAX));
        }
    }
}
