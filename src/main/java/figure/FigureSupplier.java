package figure;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RANDOM_UNIT = 100;
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int randomIndex = new Random().nextInt(FIGURE_COUNT);
        colorSupplier.getRandomColor();
        switch (randomIndex) {
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d,
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d,
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d,
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d,
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
            case 4:
                return new Square(colorSupplier.getRandomColor(),
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
            default:
                return new Circle(colorSupplier.getRandomColor(),
                        (new Random().nextInt(RANDOM_UNIT) + 1) * 0.01d);
        }
    }
}
