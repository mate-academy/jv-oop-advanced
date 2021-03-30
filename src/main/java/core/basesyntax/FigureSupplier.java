package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private RandomColorGenerator randomColorGenerator;

    public FigureSupplier(RandomColorGenerator randomColorGenerator) {
        this.randomColorGenerator = randomColorGenerator;
    }

    public Figure[] generateFigures() {
        Figure[] figures = new Figure[new Random().nextInt(100)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = generateRandomFigure();
        }
        return figures;
    }

    private Figure generateRandomFigure() {
        Random index = new Random();
        Figure figure = null;
        switch (index.nextInt(5)) {
            case 0:
                figure = generateCircle();
                break;
            case 1:
                figure = generateSquare();
                break;
            case 2:
                figure = generateTriangle();
                break;
            case 3:
                figure = generateRectangle();
                break;
            case 4:
                figure = generateTrapezoid();
                break;
            default:
                break;
        }
        return figure;
    }

    private Figure generateTrapezoid() {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(80);
        int oppositeToB = random.nextInt(100);
        while (oppositeToB < b) {
            b = random.nextInt(100);
        }
        int height = 2 * a * (b + oppositeToB);
        return new Trapezoid(randomColorGenerator.generateColor(), b, oppositeToB, height);
    }

    private Figure generateRectangle() {
        int side1 = new Random().nextInt(100);
        int side2 = new Random().nextInt(100);
        while (side2 == side1) {
            side2 = new Random().nextInt(100);
        }
        return new Rectangle(randomColorGenerator.generateColor(), side1, side2);
    }

    private Figure generateTriangle() {
        int coefficient = new Random().nextInt(100);
        return new Triangle(randomColorGenerator.generateColor(),
                coefficient * 3, coefficient * 4, coefficient * 5);
    }

    private Figure generateSquare() {
        return new Square(randomColorGenerator.generateColor(), new Random().nextInt(100));
    }

    private Figure generateCircle() {
        return new Circle(randomColorGenerator.generateColor(), new Random().nextInt(100));
    }
}
