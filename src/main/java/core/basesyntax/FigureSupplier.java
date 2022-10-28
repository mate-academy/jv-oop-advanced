package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(5);
        switch (index) {
            case 0:
                figure = new Circle(colorSupplier.getRandomColor(), random.nextDouble());
                break;
            case 1:
                figure = new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(),
                        random.nextDouble());
                break;
            case 2:
                figure = new Square(colorSupplier.getRandomColor(), random.nextDouble());
                break;
            case 3:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble(), random.nextDouble());
                break;
            case 4:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(), random.nextDouble());
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(Color.WHITE.name(), 10);
        return circle;
    }
}
