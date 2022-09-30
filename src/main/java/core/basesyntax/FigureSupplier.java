package core.basesyntax;

import java.util.Random;

public final class FigureSupplier {
    private static final Color DEFAULT_FIGURE_COLOR = Color.WHITE;
    private static final double DEFAULT_SIDE_DIMENSION = 10.0;
    private static final double MINIMUM_DIMENSION = 0.1;
    private static final double MAXIMUM_DIMENSION = 1000.0;
    private final Random randGenerator;
    private final ColorSupplier supplier;

    public FigureSupplier(Random randGenerator, ColorSupplier supplier) {
        this.randGenerator = randGenerator;
        this.supplier = supplier;
    }

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
        String[] figuresClassList = {"Circle", "Square", "Rectangle",
                "RightTriangle", "IsoscelesTrapezoid"};
        int numberOfFigures = figuresClassList.length;
        return figuresClassList[randGenerator.nextInt(numberOfFigures)];
    }

    private double getRandomSideDimension() {
        return MINIMUM_DIMENSION
                + (MAXIMUM_DIMENSION
                - MINIMUM_DIMENSION)
                * randGenerator.nextDouble();

    }
}
