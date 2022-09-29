package core.basesyntax;

import java.util.Random;

public final class FigureSupplier {
    public static final Color DEFAULT_FIGURE_COLOR = Color.WHITE;
    public static final double DEFAULT_SIDE_DIMENSION = 10.0;
    private final String[] figuresClassList = {"Circle", "Square", "Rectangle",
            "RightTriangle", "IsoscelesTrapezoid"};
    private final int numberOfFigures = figuresClassList.length;
    private final Random randGen = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_SIDE_DIMENSION);
    }

    public Figure getRandomFigure() {
        Color color = supplier.getRandomColor();
        String clazz = getRandomClass();
        return getFigure(clazz, color);
    }

    private Figure getFigure(String clazz, Color color) {
        switch (clazz) {
            case "Square":
                double side = getRandomSideDimension();
                return new Square(color, side);
            case "Rectangle":
                double base = getRandomSideDimension();
                double rectangleLeg = getRandomSideDimension();
                return new Rectangle(color, base, rectangleLeg);
            case "RightTriangle":
                double firstCathetus = getRandomSideDimension();
                double secondCathetus = getRandomSideDimension();
                return new RightTriangle(color, firstCathetus, secondCathetus);
            case "IsoscelesTrapezoid":
                double longBase = getRandomSideDimension();
                double shortBase = getRandomSideDimension();
                double trapezoidLeg = getRandomSideDimension();
                return new IsoscelesTrapezoid(color, longBase, shortBase, trapezoidLeg);
            case "Circle":
                double radius = getRandomSideDimension();
                return new Circle(color, radius);
            default:
                return getDefaultFigure();
        }
    }

    private String getRandomClass() {
        return figuresClassList[randGen.nextInt(numberOfFigures)];
    }

    private double getRandomSideDimension() {
        return FigureDimensionsValidator.MINIMUM_DIMENSION
                + (FigureDimensionsValidator.MAXIMUM_DIMENSION
                - FigureDimensionsValidator.MINIMUM_DIMENSION)
                * randGen.nextDouble();

    }
}
