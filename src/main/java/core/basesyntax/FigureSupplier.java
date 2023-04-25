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
                String color = colorSupplier.getRandomColor();
                double side = getRandomSize();
                return new Square(color, side);
            case 1:
                color = colorSupplier.getRandomColor();
                double width = getRandomSize();
                double length = getRandomSize();
                return new Rectangle(color, width, length);
            case 2:
                color = colorSupplier.getRandomColor();
                double firstLeg = getRandomSize();
                double secondLeg = getRandomSize();
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                color = colorSupplier.getRandomColor();
                double radius = getRandomSize();
                return new Circle(color, radius);
            case 4:
                color = colorSupplier.getRandomColor();
                double topSide = getRandomSize();
                double bottomSide = getRandomSize();
                double height = getRandomSize();
                return new IsoscelesTrapezoid(color, topSide, bottomSide, height);
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
