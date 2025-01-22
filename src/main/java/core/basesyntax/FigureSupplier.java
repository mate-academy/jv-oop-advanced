package core.basesyntax;

public class FigureSupplier extends ColorSupplier {
    private static final int FIGURE_SIZE = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_RADIUS = 10;
    private static final Figure DEFAULT_FIGURES = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURES;
    }

    public Figure getRandomFigure() {
        int numberOfFigures = ListOfFigures.values().length;
        int randomNumberFigure = random.nextInt(numberOfFigures);
        ListOfFigures selectedFigure = ListOfFigures.values()[randomNumberFigure];
        String randomColor = colorSupplier.getRandomColor();
        switch (selectedFigure) {
            case CIRCLE:
                int randomRadius = random.nextInt(1, FIGURE_SIZE / 2);
                return new Circle(randomColor, randomRadius);
            case SQUARE:
                int randomSide = random.nextInt(1, FIGURE_SIZE);
                return new Square(randomColor, randomSide);
            case RECTANGLE:
                int rectangleRandomFirstLeg = random.nextInt(1, FIGURE_SIZE);
                int rectangleRandomSecondLeg = random.nextInt(1, FIGURE_SIZE);
                return new Rectangle(randomColor, rectangleRandomFirstLeg,
                        rectangleRandomSecondLeg);
            case RIGHT_TRIANGLE:
                int rightTriangleRandomFirstLeg = random.nextInt(1, FIGURE_SIZE);
                int rightTriangleRandomSecondLeg = random.nextInt(1, FIGURE_SIZE);
                return new RightTriangle(randomColor,rightTriangleRandomFirstLeg,
                        rightTriangleRandomSecondLeg);
            default:
                int isoscelesTrapezoidRandomFirstLeg = random.nextInt(1, FIGURE_SIZE);
                int isoscelesTrapezoidRandomSecondLeg = random.nextInt(1, FIGURE_SIZE);
                int randomHeight = random.nextInt(1, FIGURE_SIZE);
                return new IsoscelesTrapezoid(randomColor, isoscelesTrapezoidRandomFirstLeg,
                        isoscelesTrapezoidRandomSecondLeg, randomHeight);
        }
    }
}
