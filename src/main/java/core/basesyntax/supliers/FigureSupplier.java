package core.basesyntax.supliers;

import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int MAX_SIZE = 50;
    private static final String DEFAULT_COLOR = "White";
    private static final String[] COLORS = {"Red", "Blue", "Green", "Yellow", "Black"};

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor(); // Генерируем случайный цвет

        switch (random.nextInt(5)) {
            case 0:
                return new Circle(getRandomSize(), color);
            case 1:
                return new Square(getRandomSize(), color);
            case 2:
                return new Rectangle(getRandomSize(), getRandomSize(), color);
            case 3:
                return new RightTriangle(getRandomSize(), getRandomSize(), color);
            case 4:
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, DEFAULT_COLOR);
    }

    private double getRandomSize() {
        return Math.round(random.nextDouble() * MAX_SIZE * 10.0) / 10.0;
    }
}
