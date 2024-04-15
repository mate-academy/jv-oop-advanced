package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(FIGURE_COUNT);

        switch (randomNumber) {
            case 0:
                int radius = random.nextInt(10);
                String colorCircle = colorSupplier.getRandomColor();
                return new Circle(radius, colorCircle);
            case 1:
                int side = random.nextInt(20);
                String colorSquare = colorSupplier.getRandomColor();
                return new Square(side, colorSquare);
            case 2:
                int firstLeg = random.nextInt(20);
                int secondLeg = random.nextInt(20);
                String colorRightTriangle = colorSupplier.getRandomColor();
                return new RightTriangle(firstLeg, secondLeg, colorRightTriangle);
            case 3:
                int firstSide = random.nextInt(20);
                int secondSide = random.nextInt(20);
                String colorRectangle = colorSupplier.getRandomColor();
                return new Rectangle(firstSide, secondSide, colorRectangle);
            case 4:
                int firstDistance = random.nextInt(20);
                int secondDistance = random.nextInt(20);
                int height = random.nextInt(20);
                String colorIsoscelesTrapezoid = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(firstDistance, secondDistance, height, colorIsoscelesTrapezoid);
            default:
                return new Circle(10, "white");

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
