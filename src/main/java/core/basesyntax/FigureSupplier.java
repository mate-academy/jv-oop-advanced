package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier color = new ColorSupplier();
        String randomColor = color.getRandomColor();
        int randomFigure = new Random().nextInt(5) + 1;

        switch (randomFigure) {
            case 1:
                int side = new Random().nextInt(21) + 1;
                return new Square(randomColor, side);
            case 2:
                int radius = new Random().nextInt(21) + 1;
                return new Circle(randomColor, radius);
            case 3:
                int width = new Random().nextInt(21) + 1;
                int heightRectangle = new Random().nextInt(21) + 1;
                return new Rectangle(randomColor, width, heightRectangle);
            case 4:
                int firstLeg = new Random().nextInt(21) + 1;
                int secondLeg = new Random().nextInt(21) + 1;
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            case 5:
                int topBase = new Random().nextInt(21) + 1;
                int bottomBase = new Random().nextInt(21) + 1;
                int heightTrapezoid = new Random().nextInt(21) + 1;
                return new IsoscelesTrapezoid(randomColor, topBase, bottomBase, heightTrapezoid);
            default:
                System.out.println("Error");
        }
        return null;
    }

    //this method should always return a white circle with a radius of 10.
    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
