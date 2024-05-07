package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(5);
        String color = ColorSupplier.getRandomColor();
        switch (figureType){
            case 0:
                double squareSide = random.nextDouble() * 10 + 1;
                return new Square(color, squareSide);
            case 1:
                double rectLength = random.nextDouble() * 10 + 1;
                double rectWidth = random.nextDouble() * 10 + 1;
                return new Rectangle(color, rectLength, rectWidth);
            case 2:
                double triangleFirstLeg = random.nextDouble() * 10 + 1;
                double triangleSecondLeg = random.nextDouble() * 10 + 1;
                return new RightTriangle(color, triangleFirstLeg, triangleSecondLeg);
            case 3:
                double circleRadius = random.nextDouble() * 10 + 1;
                return new Circle(color, circleRadius);
            case 4:
                double trapezoidBase1 = random.nextDouble() * 10 + 1;
                double trapezoidBase2 = random.nextDouble() * 10 + 1;
                double trapezoidHeight = random.nextDouble() * 10 + 1;
                return new IsoscelesTrapezoid(color, trapezoidBase1, trapezoidBase2, trapezoidHeight);
            default:
                return null;
        }
    }
    public static Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
