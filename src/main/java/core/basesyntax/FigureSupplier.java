package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 0:
                double side = random.nextInt(10) + 1;
                String squareColor = colorSupplier.getRandomColor();
                return new Square(side, squareColor);

            case 1:
                double width = random.nextInt(10) + 1;
                double height = random.nextInt(10) + 1;
                String rectColor = colorSupplier.getRandomColor();
                return new Rectangle(width, height, rectColor);

            case 2:
                double firstLeg = random.nextInt(10) + 1;
                double secondLeg = random.nextInt(10) + 1;
                String triColor = colorSupplier.getRandomColor();
                return new RightTriangle(firstLeg, secondLeg, triColor);

            case 3:
                double topBase = random.nextInt(10) + 1;
                double bottomBase = topBase + random.nextInt(10) + 1;
                double trapHeight = random.nextInt(10) + 1;
                String trapColor = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(topBase, bottomBase, trapHeight, trapColor);

            default:
                double radius = random.nextInt(10) + 1;
                String circColor = colorSupplier.getRandomColor();
                return new Circle(radius, circColor);
        }
    }

    public Figure getDefaultFigure() {
        double defaultRadius = 10.0;
        String defaultColor = "white";
        return new Circle(defaultRadius, defaultColor);
    }
}
