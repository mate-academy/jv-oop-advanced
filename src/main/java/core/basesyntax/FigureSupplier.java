package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public Figure getRandomFigure() {
        Figure temp = null;
        Random figure = new Random();
        int num = figure.nextInt(5) + 1;
        int sideA = Math.abs(figure.nextInt(10) + 1);
        int sideB = Math.abs(figure.nextInt(10) + 1);
        int height = Math.abs(figure.nextInt(10) + 1);
        int firstLeg = Math.abs(figure.nextInt(10) + 1);
        int secondLeg = Math.abs(figure.nextInt(10) + 1);
        int radius = Math.abs(figure.nextInt(10) + 1);
        String color = getRandomColor();

        switch (num) {
            case (1):
                temp = new IsoscelesTrapezoid();
                temp.setParameters(sideA, sideB, height, firstLeg, secondLeg, radius, color);
                return temp;
            case (2):
                temp = new Square();
                temp.setParameters(sideA, sideB, height, firstLeg, secondLeg, radius, color);
                return temp;
            case (3):
                temp = new RightTriangle();
                temp.setParameters(sideA, sideB, height, firstLeg, secondLeg, radius, color);
                return temp;
            case (4):
                temp = new Circle();
                temp.setParameters(sideA, sideB, height, firstLeg, secondLeg, radius, color);
                return temp;
            case (5):
                temp = new Rectangle();
                temp.setParameters(sideA, sideB, height, firstLeg, secondLeg, radius, color);
                return temp;
            default:
                return temp;
        }
    }
}
