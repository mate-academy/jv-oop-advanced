package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getRandomFigure() {

        String[] figures = {"circle", "square", "RightTriangle", "trapezoid", "rectangle"};
        int index = new Random().nextInt(figures.length);
        Figure figure = null;
        String randomFigure = figures[index];
        switch (randomFigure) {
            case "square" :
                Figure square = new Square(new Random().nextInt(100),
                        colorSupplier.getRandomColor());
                figure = square;
                break;
            case "circle" :
                Figure circle = new Circle(new Random().nextInt(100),
                        colorSupplier.getRandomColor());
                figure = circle;
                break;
            case "rectangle" :
                Figure rectangle = new Rectangle(new Random().nextInt(100),new Random()
                        .nextInt(100), colorSupplier.getRandomColor());
                figure = rectangle;
                break;
            case "RightTriangle" :
                Figure rightTriangle = new RightTriangle(new Random().nextInt(100),
                        new Random().nextInt(100), colorSupplier.getRandomColor());
                figure = rightTriangle;
                break;
            case "trapezoid" :
                Figure trapezoid = new IsoscelesTrapezoid(new Random().nextInt(50)
                , new Random().nextInt(50), new Random().nextInt(50), new Random()
                        .nextInt(50), colorSupplier.getRandomColor());
                figure = trapezoid;
                break;
            default:
                getRandomFigure();
                break;
        }
        return figure;
    }
    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}
