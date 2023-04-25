package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        String[] figureTypes = {"Square", "Rectangle",
                "Right Rectangle", "Circle", "Isosceles Trapezoid"};
        int figureTypeIndex = random.nextInt(figureTypes.length);
        String figureType = figureTypes[figureTypeIndex];
        return createFigure(figureType, random, colorSupplier);
    }

    private static Figure createFigure(String figureType,
                                       Random random,
                                       ColorSupplier colorSupplier) {
        Figure figure;
        switch (figureType) {
            case "Square":
                double side = random.nextDouble() * 10 + 1;
                figure = new Square(side, colorSupplier.getRandomColor());
                break;
            case "Rectangle":
                double length = random.nextDouble() * 10;
                double width = random.nextDouble() * 10;
                figure = new Rectangle(length, width, colorSupplier.getRandomColor());
                break;
            case "Right Rectangle":
                double firstleg = random.nextDouble() * 10;
                double secondleg = random.nextDouble() * 10;
                figure = new RightTriangle(firstleg, secondleg, colorSupplier.getRandomColor());
                break;
            case "Circle":
                double radius = random.nextDouble() * 10;
                figure = new Circle(radius, colorSupplier.getRandomColor());
                break;
            case "Isosceles Trapezoid":
                double upperSide =
                        random.nextDouble() * 10;
                double lowerSide =
                        random.nextDouble() * 10;
                double height =
                        random.nextDouble() * 10;
                figure = new IsoscelesTrapezoid(upperSide,
                        lowerSide, height,
                        colorSupplier.getRandomColor());
                break;
            default:
                throw new RuntimeException("Invalid figure type");
        }
        return figure;
    }

    public static Figure getDefaultFigure() {
        return (Figure) new Circle(10, "white");
    }
}
