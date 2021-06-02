package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;

    public Figure getRandomFigure() {
        Random random = new Random();
        int randomIndex = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (randomIndex) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(15));
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(15));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(15), random.nextInt(15));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(15), random.nextInt(15));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(15), random.nextInt(15), random.nextInt(15));
            default:
                return null;
        }
    }
}
