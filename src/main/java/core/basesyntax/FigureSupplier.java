package core.basesyntax;

import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MIN_RANDOM_PARAMETER = 1;
    private static final int MAX_RANDOM_PARAMETER = 10;
    private ColorSupplier colorSupplier;
    private Random random = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Figures randomType = getRandomFigureType();
        String randomColor = colorSupplier.getRandomColor();

        switch (randomType) {
            case SQUARE:
                return new Square(randomColor, getRandomParameter());
            case RECTANGLE:
                return new Rectangle(randomColor, getRandomParameter(), getRandomParameter());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor, getRandomParameter(), getRandomParameter());
            case CIRCLE:
                return new Circle(randomColor, getRandomParameter());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor, getRandomParameter(),
                        getRandomParameter(), getRandomParameter());
            default:
                throw new IllegalArgumentException("This figure doesn't exist");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Colors.WHITE.toString().toLowerCase(), 10);
    }

    private Figures getRandomFigureType() {
        int index = random.nextInt(Figures.values().length);
        return Figures.values()[index];
    }

    private double getRandomParameter() {
        return random.nextInt(MIN_RANDOM_PARAMETER,MAX_RANDOM_PARAMETER + 1);
    }
}
