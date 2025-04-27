package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfRandomFigure = random.nextInt(FIGURE_COUNT);
        Figure figure;
        int firstParam = random.nextInt(99) + 1;
        int secondParam = random.nextInt(99) + 1;
        int thirdParam = random.nextInt(99) + 1;

        switch (numberOfRandomFigure) {
            case 0:
                figure = new Square(firstParam);
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(firstParam, secondParam);
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new Circle(firstParam);
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new RightTriangle(firstParam, secondParam);
                figure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                figure = new IsoscelesTrapezoid(firstParam, secondParam, thirdParam);
                figure.setColor(colorSupplier.getRandomColor());
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor(Color.WHITE.name());
        return circle;
    }
}
