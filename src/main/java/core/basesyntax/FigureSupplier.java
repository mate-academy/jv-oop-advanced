package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        Color randomColor = getRandomColor();
        int randomNumber = random.nextInt();
        int randomFigureNumber = random.nextInt(6);
        Figure figure = new Figure();

        switch (randomFigureNumber) {
            case 1: {
                return new RightTriangle(random.nextDouble(), random.nextDouble());
            }
            case 2: {
                return new Square(random.nextDouble());
            }
            case 3: {
                return new Circle(random.nextDouble());
            }
            case 4: {
                return new Trapezoid(random.nextDouble(), random.nextDouble(), random.nextDouble());
            }
            case 5: {
                return new Rectangle(random.nextDouble(), random.nextDouble());
            }
            default:
                System.out.println();

        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure whiteCircle = new Circle(10);
        Color color = Color.WHITE;
        return whiteCircle;
    }
}




