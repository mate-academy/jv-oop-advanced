package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Figure [] figure = new Figure[5];
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    public Figure getRandomFigure() {
        figure[0] = new Square(random.nextDouble(), colorSupplier.getRandomColor());
        figure[1] = new RightTriangle(random.nextDouble(), random.nextDouble(), colorSupplier.getRandomColor());
        figure[2] = new Rectangle(random.nextDouble(), random.nextDouble(), colorSupplier.getRandomColor());
        figure[3] = new IsoscelesTrapezoid(3.0, 5.0, 6.0, colorSupplier.getRandomColor());
        return figure[random.nextInt(figure.length)];
        }
    public Figure getDefaultFigure(){
        figure[4] = new Circle(10.0, Color.WHITE.name().toUpperCase());
        return figure[4];
    }
}
