package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        String randomColor = new ColorSupplier().getRandomColor();
        int randomFigure = random.nextInt(5);
        switch (randomFigure) {
            case 0:
                return new Square(randomColor, random.nextInt(10));
            case 1:
                return new Rectangle(randomColor, random.nextInt(10), random.nextInt(10));
            case 2:
                return new RightTriangle(randomColor, random.nextInt(10), random.nextInt(10));
            case 3:
                return new Circle(randomColor, random.nextInt(10));
            case 4:
                return new IsoscelesTrapezoid(randomColor, random.nextInt(10),
                        random.nextInt(10), random.nextInt(10));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white",10);
    }
}
