package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;
    private static final int MAX_VALUE = 50;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (random.nextInt(FIGURE_AMOUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(Locale.ROOT),10);
    }
}
