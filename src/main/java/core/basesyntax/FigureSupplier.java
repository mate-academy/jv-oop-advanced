package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public Figure getRandomFigure() {
        final int figureCount = 5;
        Figure temporaryFigure = null;
        Random randomNumber = new Random();
        int num = randomNumber.nextInt(figureCount) + 1;
        final int sideA;
        final int sideB;
        final int height;
        final int firstLeg;
        final int secondLeg;
        final int radius;
        final String color = getRandomColor();

        switch (num) {
            case (1):
                sideA = Math.abs(randomNumber.nextInt(figureCount) + 1);
                sideB = Math.abs(randomNumber.nextInt(figureCount) + 1);
                height = Math.abs(randomNumber.nextInt(figureCount) + 1);
                temporaryFigure = new IsoscelesTrapezoid(sideA,sideB,height,color);
                return temporaryFigure;
            case (2):
                sideA = Math.abs(randomNumber.nextInt(figureCount) + 1);
                temporaryFigure = new Square(sideA,color);
                return temporaryFigure;
            case (3):
                firstLeg = Math.abs(randomNumber.nextInt(figureCount) + 1);
                secondLeg = Math.abs(randomNumber.nextInt(figureCount) + 1);
                temporaryFigure = new RightTriangle(firstLeg,secondLeg,color);
                return temporaryFigure;
            case (4):
                radius = Math.abs(randomNumber.nextInt(figureCount) + 1);
                temporaryFigure = new Circle(radius,color);
                return temporaryFigure;
            case (5):
                sideA = Math.abs(randomNumber.nextInt(figureCount) + 1);
                sideB = Math.abs(randomNumber.nextInt(figureCount) + 1);
                temporaryFigure = new Rectangle(sideA,sideB,color);
                return temporaryFigure;
            default:
                return temporaryFigure;
        }
    }
}
