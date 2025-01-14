package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure(){

        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();

        Figure[] figure = new Figure[5];
        figure[0] = new Square(random.nextInt(10) + 1, supplier.getRandomColor());
        figure[1] = new Circle(random.nextInt(10) + 1, supplier.getRandomColor());
        figure[2] = new Rectangle(random.nextInt(10) + 1, random.nextInt(10) + 11, supplier.getRandomColor());
        figure[3] = new RightTriangle(random.nextInt(10) + 1, random.nextInt(10) + 1, supplier.getRandomColor());
        figure[4] = new IsoscelesTrapezoid(random.nextInt(5) + 1, random.nextInt(5) + 6, random.nextInt(10) + 1, supplier.getRandomColor());
        return figure[random.nextInt(5)];
    }

    public Figure getDefaultFigure() {
        ColorSupplier supplier = new ColorSupplier();
        return new Circle(10, supplier.getDefaultColor());
    }
}
