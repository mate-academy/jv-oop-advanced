package core.basesyntax;

import java.util.Random;

public class FigureMaker {
    public Figure getFigure() {
        int randomFigureIndex = new Random().nextInt(FiguresList.values().length);
        ColorMaker randomColorIndex = new ColorMaker();

        switch (randomFigureIndex) {
            case 0:
                double radius = new Random().nextInt(15);
                return new Circle(radius,randomColorIndex.getColor());
            case 1:
                double hypotenuse = new Random().nextInt(15);
                double catathetusA = new Random().nextInt(15);
                double catathetusB = new Random().nextInt(15);
                return new RightTriangle(hypotenuse, catathetusA, catathetusB,
                                            randomColorIndex.getColor());

            case 2:
                double sideA = new Random().nextInt(15);
                double sideB = new Random().nextInt(15);
                return new Rectangle(sideA, sideB, randomColorIndex.getColor());

            case 3:
                double sideBigger = new Random().nextInt(15);
                double sideSmaller = new Random().nextInt(15);
                double height = new Random().nextInt(15);
                return new IsoscelesTrapezoid(sideBigger, sideSmaller, height,
                                                    randomColorIndex.getColor());

            case 4:
            default:
                double side = new Random().nextInt(15);
                return new Square(side, randomColorIndex.getColor());
        }
    }
}
