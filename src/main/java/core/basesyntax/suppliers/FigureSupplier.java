package core.basesyntax.suppliers;

import core.basesyntax.base.Figure;
import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    private enum FigureType {
        CIRCLE("circle"),
        ISOSCELES_TRAPEZOID("isosceles trapezoid"),
        RECTANGLE("rectangle"),
        RIGHT_TRIANGLE("right triangle"), SQUARE("square");

        String name;

        FigureType(String name) {
            this.name = name;
        }
    }

    private static double getRandomProperty() {
        return (int) (Math.random() * 50);
    }

    public static Figure getRandomFigure() {
        FigureType[] figureTypes = FigureType.values();
        int figureCount = figureTypes.length;

        Random random = new Random();
        int index = random.nextInt(figureCount);

        FigureType type = figureTypes[index];

        String color = ColorSupplier.getRandomColor();

        switch (type) {
            case CIRCLE:
                double radius = getRandomProperty();
                return new Circle(color, radius);
            case RECTANGLE:
                double firstSide = getRandomProperty();
                double secondSide = getRandomProperty();
                return new Rectangle(color, firstSide, secondSide);
            case SQUARE:
                double side = getRandomProperty();
                return new Square(color, side);
            case RIGHT_TRIANGLE:
                double firstLeg = getRandomProperty();
                double secondLeg = getRandomProperty();
                return new RightTriangle(color, firstLeg, secondLeg);
            case ISOSCELES_TRAPEZOID:
                double topBase = getRandomProperty();
                double bottomBase = getRandomProperty();
                double height = getRandomProperty();
                return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
            default:
                return getDefaultFigure();
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
