package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_FIGURES = 5;
    private static final int MAX_NUMBER_PARAMETERS = 10;

    public Figure getRandomFigure(){
        Random random = new Random();
        int index = random.nextInt(NUMBER_FIGURES);
        switch (index) {
            case 0 :
                return new Circle(random.nextInt(MAX_NUMBER_PARAMETERS),new ColorSupplier().getRandomColor());
            case 1 :
                return new Square(random.nextInt(MAX_NUMBER_PARAMETERS),new ColorSupplier().getRandomColor());
            case 2 :
                return new Rectangle(random.nextInt(MAX_NUMBER_PARAMETERS),random.nextInt(MAX_NUMBER_PARAMETERS),new ColorSupplier().getRandomColor());
            case 3 :
                return new RightTriangle(random.nextInt(MAX_NUMBER_PARAMETERS),random.nextInt(MAX_NUMBER_PARAMETERS),new ColorSupplier().getRandomColor());
            default:
                return new IsoscelesTrapezoid(random.nextInt(MAX_NUMBER_PARAMETERS),random.nextInt(MAX_NUMBER_PARAMETERS),new ColorSupplier().getRandomColor());
        }
    }

    public Figure getDefaultFigure(){
        Figure figure = new Circle(DEFAULT_RADIUS,Color.WHITE.name().toLowerCase());
        return  figure;
    }
}
