package core.basesyntax.service;

import core.basesyntax.entities.Circle;
import core.basesyntax.entities.Color;
import core.basesyntax.entities.Figure;
import core.basesyntax.entities.IsoscelesTrapezoid;
import core.basesyntax.entities.Rectangle;
import core.basesyntax.entities.RightTriangle;
import core.basesyntax.entities.Square;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

public class FigureSupplier {
    private static final Integer SIDE = 21;
    private static final String COLOR = Color.PINK.toString();
    private static final List<Class<? extends Figure>> FIGURE_TYPES =
            List.of(Circle.class, IsoscelesTrapezoid.class, Rectangle.class,
                    RightTriangle.class, Square.class);
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Class<? extends Figure> randomFigureType =
                FIGURE_TYPES.get(random.nextInt(FIGURE_TYPES.size()));
        Figure randomFigure = randomFigureType.getDeclaredConstructor().newInstance();
        randomFigure.setRandom(random);
        return randomFigure.setRandomProperties(colorSupplier);
    }

    public Figure getDefaultFigure() {
        return new Square(random, SIDE, COLOR);
    }
}
