package core.basesyntax;

import java.util.Random;

public class RandomFigure {
    public Figure getFigure() {

        int figureIndex = new Random().nextInt(Figures.values().length);

        int colorIndex = new Random().nextInt(Color.values().length);
        Color randomColor = Color.values()[colorIndex];

        switch (figureIndex) {
            case 0:
                double side = new Random().nextInt(15);
                return new Square(side, randomColor.toString());
            case 1:
                double sideA = new Random().nextInt(15);
                double sideB = new Random().nextInt(20);
                return new Rectangle(sideA, sideB, randomColor.toString());
            case 2:
                double sideT = new Random().nextInt(15);
                double base = new Random().nextInt(20);
                return new RightTriangle(sideT, base, randomColor.toString());
            case 3:
                double radius = new Random().nextInt(20);
                return new Circle(radius, randomColor.toString());
            case 4:
                double topSide = new Random().nextInt(20);
                double bottomSide = new Random().nextInt(30);
                double height = new Random().nextInt(20);
                return new IsoscelesTrapezoid(topSide, bottomSide, height, randomColor.toString());
            default:
                double random = new Random().nextInt(15);
                return new Square(random, randomColor.toString());
        }
    }
}
