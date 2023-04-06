package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FigureSupplier {
    private static final int MAGIC_NUMBER = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Figure f1 = new Circle(getRandomProperty(), supplier.getRandomColor());
        Figure f2 = new Square(getRandomProperty(), getRandomProperty(),
                supplier.getRandomColor());
        Figure f3 = new RightTriangle(getRandomProperty(), getRandomProperty(),
                getRandomProperty(), supplier.getRandomColor());
        Figure f4 = new Rectangle(getRandomProperty(), getRandomProperty(),
                supplier.getRandomColor());
        Figure f5 = new IsoscelesTrapezoid(getRandomProperty(), getRandomProperty(),
                getRandomProperty(), supplier.getRandomColor());
        List<Figure> figures = new ArrayList<>();
        figures.add(f1);
        figures.add(f2);
        figures.add(f3);
        figures.add(f4);
        figures.add(f5);
        return figures.get(random.nextInt(figures.size()));
    }

    public Circle getDefaultFigure() {
        return new Circle(MAGIC_NUMBER, Color.WHITE.name());
    }

    private double getRandomProperty() {
        return random.nextDouble();
    }
}
