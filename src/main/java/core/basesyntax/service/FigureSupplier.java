package core.basesyntax.service;

import core.basesyntax.entities.Circle;
import core.basesyntax.entities.Color;
import core.basesyntax.entities.Figure;
import core.basesyntax.entities.IsoscelesTrapezoid;
import core.basesyntax.entities.Rectangle;
import core.basesyntax.entities.RightTriangle;
import core.basesyntax.entities.Square;
import java.util.HashMap;
import java.util.Random;

public class FigureSupplier {
    private static final Integer SIDE = 21;
    private static final Integer INT_BOUND = 100;
    private static final Double DOUBLE_BOUND = 360.0;
    private final HashMap<Integer, Figure> figures;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
        figures = new HashMap<>();
        figures.put(0, new Circle());
        figures.put(1, new IsoscelesTrapezoid());
        figures.put(2, new Rectangle());
        figures.put(3, new RightTriangle());
        figures.put(4, new Square());
    }

    public Figure getRandomFigure() {
        return setRandomProperties(figures.get(random.nextInt(figures.size())));
    }

    public Figure getDefaultFigure() {
        return new Square(SIDE, Color.PINK);
    }

    private Figure setRandomProperties(Figure figure) {
        figure.setColor(colorSupplier.getRandomColor());

        switch (figure.getClass().getName()) {
            case ("core.basesyntax.entities.Circle"):
                Circle circle = (Circle) figure;
                circle.setRadius(random.nextInt(INT_BOUND));
                return circle.clone();

            case ("core.basesyntax.entities.IsoscelesTrapezoid"):
                IsoscelesTrapezoid isoscelesTrapezoid = (IsoscelesTrapezoid) figure;
                isoscelesTrapezoid.setAngle(DOUBLE_BOUND * random.nextDouble());
                isoscelesTrapezoid.setLowerBase(random.nextInt(INT_BOUND));
                isoscelesTrapezoid.setUpperBase(random.nextInt(INT_BOUND));
                isoscelesTrapezoid.setSide(random.nextInt(INT_BOUND));
                return isoscelesTrapezoid.clone();

            case ("core.basesyntax.entities.Rectangle"):
                Rectangle rectangle = (Rectangle) figure;
                rectangle.setBase(random.nextInt(INT_BOUND));
                rectangle.setSide(random.nextInt(INT_BOUND));
                return rectangle.clone();

            case ("core.basesyntax.entities.RightTriangle"):
                RightTriangle rightTriangle = (RightTriangle) figure;
                rightTriangle.setFirstLeg(random.nextInt(INT_BOUND));
                rightTriangle.setSecondLeg(random.nextInt(INT_BOUND));
                rightTriangle.setHypotenuse(random.nextInt(INT_BOUND));
                return rightTriangle.clone();

            case ("core.basesyntax.entities.Square"):
                Square square = (Square) figure;
                square.setSide(random.nextInt(INT_BOUND));
                return square.clone();

            default:
                throw new RuntimeException("Invalid class type.");
        }
    }
}
