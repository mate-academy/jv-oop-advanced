package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 6;
    private Random random = new Random();
    private Figure figureObject;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private NumberSupplier numberSupplier = new NumberSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 1 :
                int radius = numberSupplier.getRandomNumber();
                figureObject = new Circle(radius, colorSupplier.getRandomColor());
                break;
            case 2 :
                int topSide = numberSupplier.getRandomNumber();
                int bottomSide = numberSupplier.getRandomNumber();
                int heightTrapezoid = numberSupplier.getRandomNumber();
                figureObject = new IsoscelesTrapezoid(topSide, bottomSide, heightTrapezoid,
                                                        colorSupplier.getRandomColor());
                break;
            case 3 :
                int width = numberSupplier.getRandomNumber();
                int heightRectangle = numberSupplier.getRandomNumber();
                figureObject = new Rectangle(width, heightRectangle,
                                                    colorSupplier.getRandomColor());
                break;
            case 4 :
                int firstLeg = numberSupplier.getRandomNumber();
                int secondLeg = numberSupplier.getRandomNumber();
                figureObject = new RightTriangle(firstLeg, secondLeg,
                                                    colorSupplier.getRandomColor());
                break;
            case 5 :
            default :
                int side = numberSupplier.getRandomNumber();
                figureObject = new Square(side, colorSupplier.getRandomColor());
        }
        return figureObject;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
