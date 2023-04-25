package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public class FigureSupplier {
    private final int maxFigureSize;
    private final double minDecimalPart;
    private final String defaultFigureColor;
    private final double defaultFigureSize;
    private Random random;
    private ColorSupplier colorSupplier;
    private DecimalFormat df;

    public FigureSupplier() {
        maxFigureSize = 100;
        minDecimalPart = 0.001;
        defaultFigureColor = "white";
        defaultFigureSize = 10;
        this.df = new DecimalFormat("#.###");
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    private double getRandomSize() {
        String randomNumber = df.format(random.nextDouble() * maxFigureSize + minDecimalPart);

        return Double.parseDouble(randomNumber);
    }

    public Figure getRandomFigure() {
        int randomFigureIndex = random.nextInt(Figures.values().length);
        String randomFigureName = Figures.values()[randomFigureIndex].name();

        switch (randomFigureName) {
            case "SQUARE":
                String squareColor = colorSupplier.getRandomColor();
                double squareSideSize = getRandomSize();
                return new Square(squareColor, squareSideSize);
            case "RECTANGLE":
                String rectangleColor = colorSupplier.getRandomColor();
                double rectangleWidth = getRandomSize();
                double rectangleHeight = getRandomSize();
                return new Rectangle(rectangleColor, rectangleWidth, rectangleHeight);
            case "RIGHT_TRIANGLE":
                String triangleColor = colorSupplier.getRandomColor();
                double triangleFirstLeg = getRandomSize();
                double triangleSecondLeg = getRandomSize();
                return new RightTriangle(triangleColor, triangleFirstLeg, triangleSecondLeg);
            case "CIRCLE":
                String circleColor = colorSupplier.getRandomColor();
                double circleRadius = getRandomSize();
                return new Circle(circleColor, circleRadius);
            case "ISOSCELES_TRAPEZOID":
                String trapezoidColor = colorSupplier.getRandomColor();
                double trapezoidTopSide = getRandomSize();
                double trapezoidBottomSide = getRandomSize();
                double trapezoidHeight = getRandomSize();
                return new IsoscelesTrapezoid(
                        trapezoidColor,
                        trapezoidTopSide,
                        trapezoidBottomSide,
                        trapezoidHeight
                );
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultFigureColor, defaultFigureSize);
    }
}
