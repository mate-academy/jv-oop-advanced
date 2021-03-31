package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static final int random1 = 3;
    public static final int max = 200;

    public static final int count = 5;

    private FigureSupplier color = new FigureSupplier();

    public static FigureMain getRandom() {

        final Random random = new Random();
        int nubmer = random.nextInt(count);
        int max = 200;
        switch (nubmer) {
            case 1:
                return new Rectangle("Rectangle",getNewColor(), random.nextInt(max),
                        random.nextInt(max));
            case 2:
                return new Square("Square", getNewColor(),random.nextInt(max));
            case 3:
                return new RightTrieangle("RightTrieangle",getNewColor(),
                           random.nextInt(max), random.nextInt(max));
            case 4:
                return new Circle("Circle", getNewColor(), random.nextInt(max));
            default:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", getNewColor(),
                           random.nextInt(max), random.nextInt(max), random.nextInt(max));
        }
    }
}



