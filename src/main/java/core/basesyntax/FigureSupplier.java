package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_PARARM = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int FIGURES_AMOUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = random.nextInt(FIGURES_AMOUNT);

        switch (figure) {
            case 0:
                return new Circle(
                        random.nextInt(),
                        colorSupplier.getRandomColor()
                );
            case 1:
                return new IsoscelesTrapezoid(
                        random.nextInt(),
                        random.nextInt(),
                        colorSupplier.getRandomColor()
                );
            case 2:
                return new Rectangle(
                        random.nextInt(),
                        random.nextInt(),
                        colorSupplier.getRandomColor()
                );
            case 3:
                return new RightTriangle(
                        random.nextInt(),
                        random.nextInt(),
                        colorSupplier.getRandomColor()
                );
            case 4:
                return new Square(random.nextInt(), colorSupplier.getRandomColor());
            default: return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_PARARM, DEFAULT_COLOR);
    }
}
