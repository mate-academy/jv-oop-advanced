package core.basesyntax.service;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class FigureSupplier {
    private static final double UNIT_BOUND = 100;
    private static final String DEFAULT_FIGURE_COLOR = "white";
    private static final double DEFAULT_FIGURE_SIDE = 10;
    private final List<Supplier<Figure>> generators;
    private final ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.generators = new ArrayList<>();
        this.generators.add(this::getRandomSquare);
        this.generators.add(this::getRandomRectangle);
        this.generators.add(this::getRandomRightTriangle);
        this.generators.add(this::getRandomCircle);
        this.generators.add(this::getRandomIsoscelesTrapezoid);

        this.colorSupplier = new ColorSupplier();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_SIDE);
    }

    public Figure getRandomFigure() {
        int randomFigureType = ThreadLocalRandom.current().nextInt(generators.size());
        return generators.get(randomFigureType).get();
    }

    private double getRandomDouble(double bound) {
        return ThreadLocalRandom.current().nextDouble(bound);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        double topSide = getRandomDouble(UNIT_BOUND);
        double bottomSide = getRandomDouble(UNIT_BOUND);
        double lateralSide = getRandomDouble(UNIT_BOUND);
        return new IsoscelesTrapezoid(color, topSide, bottomSide, lateralSide);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        double radius = getRandomDouble(UNIT_BOUND);
        return new Circle(color, radius);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        double firstLeg = getRandomDouble(UNIT_BOUND);
        double secondLeg = getRandomDouble(UNIT_BOUND);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        double topSide = getRandomDouble(UNIT_BOUND);
        double lateralSide = getRandomDouble(UNIT_BOUND);
        return new Rectangle(color, topSide, lateralSide);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        double side = getRandomDouble(UNIT_BOUND);
        return new Square(color, side);
    }
}
