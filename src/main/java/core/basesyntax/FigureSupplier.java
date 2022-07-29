package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_RANDOM_VALUE = 100;

    public String getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        Figure square = new Square(random.nextInt(MAX_RANDOM_VALUE),
                colorSupplier.getRandomColor());
        Rectangle rectangle = new Rectangle(random.nextInt(MAX_RANDOM_VALUE),
                random.nextInt(MAX_RANDOM_VALUE), colorSupplier.getRandomColor());
        Circle circle = new Circle(random.nextInt(MAX_RANDOM_VALUE),
                colorSupplier.getRandomColor());
        Figure[] figures = {square, rectangle, circle};
        int index = random.nextInt(figures.length);
        Figure selectedFigure = figures[index];
        return selectedFigure.draw();
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10,"WHITE");
        return circle;
    }
}
