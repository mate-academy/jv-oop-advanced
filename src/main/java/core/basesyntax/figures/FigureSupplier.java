package core.basesyntax.figures;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        double numb = (double) Math.round(random.nextDouble() * 100) / 100;
        Figure[] figures = {
                new Circle(numb, new ColorSupplier().getRandomColor()),
                new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),numb, numb, numb),
                new Rectangle(new ColorSupplier().getRandomColor(), numb, numb),
                new RightTriangle(new ColorSupplier().getRandomColor(), numb, numb),
                new Square(new ColorSupplier().getRandomColor(), numb),

        };

        int index = random.nextInt(figures.length);

        return figures[index];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.name());
    }
}
