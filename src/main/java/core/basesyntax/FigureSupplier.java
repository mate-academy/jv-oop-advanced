package core.basesyntax;

import java.text.DecimalFormat;
import java.util.Random;

public class FigureSupplier {
    private final DecimalFormat df = new DecimalFormat("#.###");
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private double getRandomSize() {
        int maxFigureSize = 100;
        double minDecimalPart = 0.001;
        double randomNumber = random.nextDouble() * maxFigureSize + minDecimalPart;
        String formattedRandomNumber = df.format(randomNumber);

        return Double.parseDouble(formattedRandomNumber);
    }

    public Figure getRandomFigure() {
        int totalAmountOfFigures = 5;
        int randomFigureNumber = random.nextInt(totalAmountOfFigures);

        switch (randomFigureNumber) {
            case 0:
                String squareColor = colorSupplier.getRandomColor();
                double squareSideSize = getRandomSize();
                return new Square(squareColor, squareSideSize);
            case 1:
                String rectangleColor = colorSupplier.getRandomColor();
                double rectangleWidth = getRandomSize();
                double rectangleHeight = getRandomSize();
                return new Rectangle(rectangleColor, rectangleWidth, rectangleHeight);
            case 2:
                String triangleColor = colorSupplier.getRandomColor();
                double triangleFirstLeg = getRandomSize();
                double triangleSecondLeg = getRandomSize();
                return new RightTriangle(triangleColor, triangleFirstLeg, triangleSecondLeg);
            case 3:
                String circleColor = colorSupplier.getRandomColor();
                double circleRadius = getRandomSize();
                return new Circle(circleColor, circleRadius);
            case 4:
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
        String defaultFigureColor = "white";
        double defaultFigureSize = 10;
        return new Circle(defaultFigureColor, defaultFigureSize);
    }
}
