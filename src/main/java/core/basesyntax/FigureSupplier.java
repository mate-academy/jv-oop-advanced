package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    public Figure getRandomFigure(int maxSize) {
        Random rand = new Random();
        String color = ColorSupplier.getRandomColor();
        int randFigureIndex = rand.nextInt(AvailableFigure.values().length);
        switch (AvailableFigure.values()[randFigureIndex].name()) {
            case "RECTANGLE":
                int randRightSide = rand.nextInt(maxSize);
                int randTopSide = rand.nextInt(maxSize);
                return new Rectangle(color, randTopSide, randRightSide);
            case "RIGHT_TRIANGLE":
                int randFirstLeg = rand.nextInt(maxSize);
                int randSecondLeg = rand.nextInt(maxSize);
                return new RightTriangle(color, randFirstLeg, randSecondLeg);
            case "CIRCLE":
                int randRadius = rand.nextInt(maxSize);
                return new Circle(color, randRadius);
            case "SQUARE":
                int randSquareSide = rand.nextInt(maxSize);
                return new Square(color, randSquareSide);
            case "ISOSCELES_TRAPEZOID":
                int randSide = rand.nextInt(maxSize);
                int randTop = rand.nextInt(maxSize);
                int randBottom = rand.nextInt(maxSize);
                return new IsoscelesTrapezoid(color, randTop, randBottom, randSide);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
