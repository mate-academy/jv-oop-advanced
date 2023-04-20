package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUM = 5; //FIGURE_NUM - number of figure subclasses
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        Figure figure;
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = random.nextInt(10);

        switch (random.nextInt(FIGURE_NUM)) {
            case 0:
                figure = new Square(a, colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(a, b, colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(a, b, colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new IsoscelesTrapezoid(a, b, c, colorSupplier.getRandomColor());
                break;
            default:
                figure = new Circle(a, colorSupplier.getRandomColor());
                break;
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
