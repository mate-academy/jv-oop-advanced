package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random;
    private final ColorSupplier color;

    public FigureSupplier() {
        this.random = new Random();
        this.color = new ColorSupplier();
    }

    public int getRandomSize() {
        return (int) (Math.random() * 10 + 1);
    }

    public AreaCalculator getRandomFigure() {
        AreaCalculator[] figures = new AreaCalculator[]{
                new Circle(getRandomSize(), color.getRandomColor()),
                new Rectangle(getRandomSize(), getRandomSize(), color.getRandomColor()),
                new RightTriangle(getRandomSize(), color.getRandomColor()),
                new Square(getRandomSize(), color.getRandomColor()),
                new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), color.getRandomColor())};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
