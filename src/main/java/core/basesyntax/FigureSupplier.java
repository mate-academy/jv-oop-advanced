package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int numberOfRandomFigure = random.nextInt(FIGURE_COUNT);
        Figure figure;

        switch (numberOfRandomFigure) {
            case 0:
                figure = new Square(random.nextInt(1,100));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(random.nextInt(1,100),random.nextInt(1,100));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new Circle(random.nextInt(1,100));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new RightTriangle(random.nextInt(1,100),random.nextInt(1,100));
                figure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                figure = new IsoscelesTrapezoid(random.nextInt(1,100),random.nextInt(1,100),
                        random.nextInt(1,100));
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
