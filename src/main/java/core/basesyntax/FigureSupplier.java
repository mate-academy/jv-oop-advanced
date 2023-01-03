package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    public static Figure getRandomFigure() {
        Random random = new Random();
        Figure[] figures = new Figure[]{new Circle("circle", getRandomColor(), random.nextInt(26)),
                new Rectangle("rectangle", getRandomColor(),
                        random.nextInt(26), random.nextInt(26)),
                new RightTriangle("triangle", getRandomColor(),
                        random.nextInt(26), random.nextInt(26)),
                new IsoscelesTrapezoid("isosceles trapezoid", getRandomColor(),
                        random.nextInt(26), random.nextInt(26),
                        random.nextInt(26), random.nextInt(26)),
                new Square("square", getRandomColor(),
                        random.nextInt(25))};
        return figures[random.nextInt(figures.length)];
    }

    public static Figure getDefaultFigure() {
        return new Circle("circle", "white", 10);
    }
}
