package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int MAX = 200;
    public static final int COUNT = 5;

    private ColorSupplier color;

    public Figure getRandomFigure() {

        Random random = new Random();
        int switchNumber = random.nextInt(COUNT);
        switch (switchNumber) {
            case 1:
                return new Rectangle("Rectangle", color.getNewColor(), random.nextInt(MAX),
                        random.nextInt(MAX));
            case 2:
                return new Square("Square", color.getNewColor(),random.nextInt(MAX));
            case 3:
                return new RightTrieangle("RightTrieangle",color.getNewColor(),
                           random.nextInt(MAX), random.nextInt(MAX));
            case 4:
                return new Circle("Circle", color.getNewColor(), random.nextInt(MAX));
            default:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", color.getNewColor(),
                           random.nextInt(MAX), random.nextInt(MAX), random.nextInt(MAX));
        }
    }
}



