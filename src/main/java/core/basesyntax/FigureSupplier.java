package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int COUNT_OF_FIGURE = 5; //Count of different figure classes
    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        this.random = new Random();
        this.colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int bound = 1000;
        /*
        typeOfFigure : 0 - IsoscelesTrapezoid,
        1 - Square,
        2 - RightTriangle,
        3 - Circle,
        4 - Rectangle
         */
        int typeOfFigure = random.nextInt(COUNT_OF_FIGURE);
        switch (typeOfFigure) {
            case 0 :
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(bound), random.nextInt(bound), random.nextInt(bound));
            case 1 :
                return new Square(colorSupplier.getRandomColor(), random.nextInt(bound));
            case 2 :
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(bound));
            case 3 :
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(bound));
            case 4 :
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(bound), random.nextInt(bound));
            default:
                return new Square(Color.BLACK, 10);
        }
    }

    public Figure getDefaultFigure() {
        /*
        typeOfFigure : 0 - IsoscelesTrapezoid,
        1 - Square,
        2 - RightTriangle,
        3 - Circle,
        4 - Rectangle
         */
        int typeOfFigure = random.nextInt(COUNT_OF_FIGURE);
        switch (typeOfFigure) {
            case 0 :
                return new IsoscelesTrapezoid(Color.RED, 10, 20, 15);
            case 1 :
                return new Square(Color.GREY, 10);
            case 2 :
                return new RightTriangle(Color.BLUE, 10);
            case 3 :
                return new Circle(Color.BLACK, 10);
            case 4 :
                return new Rectangle(Color.WHITE, 20, 10);
            default:
                return new Square(Color.BLACK, 10);
        }
    }
}
