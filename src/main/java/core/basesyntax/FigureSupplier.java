package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        Figure [] figures = new Figure[] {new Square(random.nextDouble()),
                new Rectangle(random.nextDouble(), random.nextDouble()),
                new RightTriangle(random.nextDouble(), random.nextDouble()),
                new Circle(random.nextDouble()),
                new IsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(), random.nextDouble())};
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor("white");
        return circle;
    }
}
