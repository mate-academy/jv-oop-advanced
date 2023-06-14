package core.basesyntax.figsupply;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    static final int RANDOM_LENGTH_MAX = 10;
    static final int RANDOM_LENGTH_MIN = 1;
    private final Random random = new Random();
    private boolean defCircle;

    public Figure getRandomFigure() {
        int valVar1 = random.nextInt(RANDOM_LENGTH_MAX - RANDOM_LENGTH_MIN) + RANDOM_LENGTH_MIN;
        int valVar2 = random.nextInt(RANDOM_LENGTH_MAX - RANDOM_LENGTH_MIN) + RANDOM_LENGTH_MIN;
        int valVar3 = random.nextInt(RANDOM_LENGTH_MAX - RANDOM_LENGTH_MIN) + RANDOM_LENGTH_MIN;

        int indexFigure = random.nextInt(FigureEnum.values().length);
        String varFigure = FigureEnum.values()[indexFigure].name();

        switch (varFigure) {
            case ("CIRCLE"):
                return new Circle(valVar1);
            case ("ISOSCELES_TRAPEZOID"):
                return new IsoscelesTrapezoid(valVar1, valVar2, valVar3);
            case ("RECTANGLE"):
                return new Rectangle(valVar1, valVar2);
            case ("RIGHT_TRIANGLE"):
                return new RightTriangle(valVar1, valVar2);
            case ("SQUARE"):
                return new Square(valVar1);
        }
        return null;
    }

/**
 * public Figure getDefaultFigure() - this method should always return white circle with radius 10.
 */
    public Figure getDefaultFigure(){
        return new Circle(10);
    }
}
