package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0 : return new Square(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1);
            case 1 : return new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 2 : return new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 3 : return new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1);
            case 4 : return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1, random.nextInt(10) + 1,
                    random.nextInt(10) + 1);
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString().toLowerCase(), 10);
    }
}
