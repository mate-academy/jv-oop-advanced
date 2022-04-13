package core.basesyntax.supplier;

import core.basesyntax.figure.Circle;
import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int BOUND = 3;
    private static final int RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();


    public Figure getRandomFigure() {
        int index = random.nextInt(BOUND);
        switch (index) {
            case (0):
                String color = colorSupplier.getRandomColor();
                int width = random.nextInt(MAX_VALUE);
                int height = random.nextInt(MAX_VALUE);
                return new Rectangle(color, width, height);
            case (1):
                color = colorSupplier.getRandomColor();
                int side = random.nextInt(MAX_VALUE);
                return new Square(color, side);
            case (2):
                color = colorSupplier.getRandomColor();
                width = random.nextInt(MAX_VALUE);
                height = random.nextInt(MAX_VALUE);
                return new Rectangle(color, width, height);
        }
        return new Square(colorSupplier.getRandomColor(),random.nextInt(MAX_VALUE));
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), RADIUS);
    }
}
