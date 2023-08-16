package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private Figure figure;

    public Figure getRandomFigure() {
        int indexOfFigure = RANDOM.nextInt(5);
        String color = new ColorSupplier().getRandomColor();
        double firstRandom = RANDOM.nextDouble() * 10 + 1;
        double secondRandom = RANDOM.nextDouble() * 10 + 1;
        switch (indexOfFigure) {
            case 0 :
                figure = new Square(firstRandom, color);
                break;
            case 1 :
                figure = new Rectangle(firstRandom, secondRandom, color);
                break;
            case 2 :
                figure = new RightTriangle(firstRandom, secondRandom, color);
                break;
            case 3 :
                figure = new Circle(firstRandom, color);
                break;
            case 4 :
                figure = new IsoscelesTrapezoid(firstRandom, secondRandom, secondRandom, color);
                break;
            default :
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
