package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private final static int MAX_SIDE = 10;
    public Figure getRandomFigure(){
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Square square = new Square(random.nextInt(MAX_SIDE), colorSupplier.getRandomColor());
        Rectangle rectangle = new Rectangle(random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE),
                colorSupplier.getRandomColor());
        Circle circle = new Circle(random.nextInt(MAX_SIDE), colorSupplier.getRandomColor());
        Triangle triangle = new Triangle(random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE),
                colorSupplier.getRandomColor());
        Figure[] figures = {square, rectangle, circle, triangle};
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure(){
        Circle circleDefault = new Circle(10, "WHITE");
        return circleDefault;
    }
}
