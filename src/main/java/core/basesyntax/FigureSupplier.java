package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    static final int COUNT_FIGURE = 6;
    static final Figure[] arrayFigures = new Figure[COUNT_FIGURE];
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Figure randomFigure;

    public Figure getRandomFigure() {
        int index = random.nextInt(NUMBER_OF_FIGURES);
        int randomValue = random.nextInt((100) + 1);
        switch (index) {
            case 0:
                randomFigure = new Circle(randomValue);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 1:
                randomFigure = new Rectangle(randomValue, randomValue);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 2:
                randomFigure = new Square(randomValue);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 3:
                randomFigure = new IsoscelesTrapezoid(randomValue, randomValue, randomValue);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            case 4:
                randomFigure = new RightTriangle(randomValue, randomValue);
                randomFigure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                break;
        }
        return randomFigure;
    }

    public Figure getDefoultFigure() {
        Figure circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
