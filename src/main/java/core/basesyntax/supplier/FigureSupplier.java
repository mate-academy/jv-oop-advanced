package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 100;
    private static final int FIGURES_NUMBER = 3;
    private static final int DEFAULT_RADIUS_CIRCLE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        String color = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                int width = random.nextInt(MAX_RANDOM_NUMBER);
                int height = random.nextInt(MAX_RANDOM_NUMBER);
                return new Rectangle(color, width, height);
            case 1:
                int side = random.nextInt(MAX_RANDOM_NUMBER);
                return new Square(color, side);
            case 2:
                width = random.nextInt(MAX_RANDOM_NUMBER);
                height = random.nextInt(MAX_RANDOM_NUMBER);
                return new Rectangle(color, width, height);
            default:
                return new Square(colorSupplier.getRandomColor(),random.nextInt(MAX_RANDOM_NUMBER));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS_CIRCLE);
    }
}
