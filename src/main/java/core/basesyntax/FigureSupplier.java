package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_RANDOM_PARAMETR = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURE_COUNT);

        switch (randomNumber) {
            case 0:
                int radius = FIGURE_RANDOM_PARAMETR;
                String colorCircle = colorSupplier.getRandomColor();
                return new Circle(radius, colorCircle);
            case 1:
                int side = FIGURE_RANDOM_PARAMETR;
                String colorSquare = colorSupplier.getRandomColor();
                return new Square(side, colorSquare);
            case 2:
                int firstLeg = FIGURE_RANDOM_PARAMETR;
                int secondLeg = FIGURE_RANDOM_PARAMETR;
                String colorRightTriangle = colorSupplier.getRandomColor();
                return new RightTriangle(firstLeg, secondLeg, colorRightTriangle);
            case 3:
                int firstSide = FIGURE_RANDOM_PARAMETR;
                int secondSide = FIGURE_RANDOM_PARAMETR;
                String colorRectangle = colorSupplier.getRandomColor();
                return new Rectangle(firstSide, secondSide, colorRectangle);
            case 4:
                int firstDistance = FIGURE_RANDOM_PARAMETR;
                int secondDistance = FIGURE_RANDOM_PARAMETR;
                int height = FIGURE_RANDOM_PARAMETR;
                String colorTrap = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(firstDistance, secondDistance, height, colorTrap);
            default:
                return new Circle(10, "\\white");

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
