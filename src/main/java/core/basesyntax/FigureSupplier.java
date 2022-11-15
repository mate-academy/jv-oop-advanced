package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Figure[] figure = new Figure[5];
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        if (random.nextDouble() == 0) {
            return null;
        }
        figure[0] = new Square(colorSupplier.getRandomColor()
                , random.nextDouble());
        figure[1] = new RightTriangle(colorSupplier.getRandomColor()
                , random.nextDouble()
                , random.nextDouble());
        figure[2] = new Rectangle(colorSupplier.getRandomColor()
                , random.nextDouble()
                , random.nextDouble());
        figure[3] = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), 3.0, 5.0, 6.0 );
        return figure[random.nextInt(figure.length - 1)];
    }
    public Figure getDefaultFigure() {
        figure[4] = new Circle(Color.WHITE.name().toLowerCase(), 10.0);
        return figure[4];
    }
}
