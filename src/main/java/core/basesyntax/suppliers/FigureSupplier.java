package core.basesyntax.suppliers;

import core.basesyntax.abstractions.Figure;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final double BOUND = 200;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        double firstRandomNumber = random.nextDouble(BOUND);
        double secondRandomNumber = random.nextDouble(BOUND);
        double thirdRandomNumber = random.nextDouble(BOUND);
        int index = random.nextInt(Figures.values().length);
        String color = colorSupplier.getRandomColor();
        Figure figure;
        switch (Figures.values()[index]) {
            case CIRCLE -> figure = new Circle(color, firstRandomNumber);
            case ISOSCELES_TRAPEZOID -> figure =
                    new IsoscelesTrapezoid(color, firstRandomNumber,
                            secondRandomNumber, thirdRandomNumber);
            case RECTANGLE -> figure =
                    new Rectangle(color, firstRandomNumber, secondRandomNumber);
            case RIGHT_TRIANGLE ->
                    figure = new RightTriangle(color,
                            firstRandomNumber, secondRandomNumber);
            case SQUARE -> figure =
                    new Square(color, firstRandomNumber);
            default -> figure = new Circle("white", 10);
        }
        return figure;

    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
