package core.basesyntax.service;

import core.basesyntax.figures.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class FigureSupplier {
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
        return new Circle("White", 10);
    }

    public Figure getRandomFigure() {
        int randomFigureType = ThreadLocalRandom.current().nextInt(generators.size());
        return generators.get(randomFigureType).get();
    }

    private static double getRandomDouble(double bound) {
        return ThreadLocalRandom.current().nextDouble(bound);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        double topSide = getRandomDouble(100);
        double bottomSide = getRandomDouble(100);
        double lateralSide = getRandomDouble(100);
        return new IsoscelesTrapezoid(color, topSide, bottomSide, lateralSide);
    }

    private Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        double radius = getRandomDouble(100);
        return new Circle(color, radius);
    }

    private Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        double firstLeg = getRandomDouble(100);
        double secondLeg = getRandomDouble(100);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        double topSide = getRandomDouble(100);
        double lateralSide = getRandomDouble(100);
        return new Rectangle(color, topSide, lateralSide);
    }

    private Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        double side = getRandomDouble(100);
        return new Square(color, side);
    }
}
