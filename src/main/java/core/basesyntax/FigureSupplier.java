package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private static final int FIGURE_COUNT = FigureType.values().length;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        FigureType figureType = FigureType.values()[random.nextInt(FIGURE_COUNT)];
        double[] properties = generateRandomProperties(figureType);
        String color = colorSupplier.getRandomColor();
        return createFigure(figureType, properties, color);
    }

    public Figure getDefaultFigure() {
        return createFigure(FigureType.CIRCLE, new double[]{10.0}, "white");
    }

    private double[] generateRandomProperties(FigureType figureType) {
        double[] properties;
        switch (figureType) {
            case SQUARE:
            case CIRCLE:
                properties = new double[]{random.nextDouble() * 10};
                break;
            case RECTANGLE:
            case RIGHT_TRIANGLE:
                properties = new double[]{random.nextDouble() * 10, random.nextDouble() * 10};
                break;
            case ISOSCELES_TRAPEZOID:
                properties = new double[]{random.nextDouble() * 10, random.nextDouble() 
                    * 10, random.nextDouble() * 5};
                break;
            default:
                properties = new double[]{};
                break;
        }
        return properties;
    }

    private Figure createFigure(FigureType figureType, double[] properties, String color) {
        switch (figureType) {
            case SQUARE:
                return new Square(properties[0], color);
            case RECTANGLE:
                return new Rectangle(properties[0], properties[1], color);
            case RIGHT_TRIANGLE:
                return new RightTriangle(properties[0], properties[1], color);
            case CIRCLE:
                return new Circle(properties[0], color);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(properties[0], properties[1], properties[2], color);
            default:
                return null;
        }
    }
}
