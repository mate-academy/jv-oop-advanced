package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        int figure = new Random().nextInt(5);
        String randomColor = new ColorSupplier().getRandomColor();

        switch (figure) {
            case 0 -> {
                return new Circle(new Random().nextInt(100), randomColor);
            }
            case 1 -> {
                int topBase = new Random().nextInt(100);
                int bottomBase = new Random().nextInt(100);
                int height = new Random().nextInt(100);
                return new IsoscelesTrapezoid(topBase, bottomBase, height, randomColor);
            }
            case 2 -> {
                int length = new Random().nextInt(100);
                int width = new Random().nextInt(100);
                return new Rectangle(length, width, randomColor);
            }
            case 3 -> {
                int firstLeg = new Random().nextInt(100);
                int secondLeg = new Random().nextInt(100);
                return new RightTriangle(firstLeg, secondLeg, randomColor);
            }
            case 4 -> {
                int sideLength = new Random().nextInt(100);
                return new Square(sideLength, randomColor);
            }
        }
        return getDefaultFigure();
    }
    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.toString());
    }
}
