package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 5;
    private static final int MAX_FIGURE_SIDE_VALUE = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Color color = this.colorSupplier.getRandomColor();
        int type = random.nextInt(FIGURES_AMOUNT);

        switch (type) {
            case 0:
                return new Circle(
                    color,
                    random.nextInt(MAX_FIGURE_SIDE_VALUE) + 1
                );
            case 1:
                return new IsoscelesTrapezoid(
                    color,
                    random.nextInt(MAX_FIGURE_SIDE_VALUE) + 1,
                    random.nextInt(MAX_FIGURE_SIDE_VALUE) + 1,
                    random.nextInt(MAX_FIGURE_SIDE_VALUE) + 1
                );
            case 2:
                return new Rectangle(
                    color,
                    random.nextInt(MAX_FIGURE_SIDE_VALUE) + 1,
                    random.nextInt(MAX_FIGURE_SIDE_VALUE) + 1
                );
            case 3:
                return new RightTriangle(
                    color,
                    random.nextInt(MAX_FIGURE_SIDE_VALUE) + 1,
                    random.nextInt(MAX_FIGURE_SIDE_VALUE) + 1
                );
            case 4:
                return new Square(
                    color,
                    random.nextInt(MAX_FIGURE_SIDE_VALUE) + 1
                );
            default:
                return this.getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }
}
