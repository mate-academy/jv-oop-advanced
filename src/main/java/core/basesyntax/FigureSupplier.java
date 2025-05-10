package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int figureNumber = random.nextInt(5);
        Figure[] figures = new Figure[]{
                new IsoscelesTrapezoid(colorSupplier.getRandomColor(),random.nextInt(10),
                         random.nextInt(10), random.nextInt(7)),
                new Circle(colorSupplier.getRandomColor(), random.nextInt(10)),
                new Rectangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(10)),
                new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(10),
                        random.nextInt(7)),
                new Square(colorSupplier.getRandomColor(), random.nextInt(10))};
        return figures[figureNumber];
    }

    public Figure getDefaultFigure() {
        return new Circle("White",10);
    }
}
