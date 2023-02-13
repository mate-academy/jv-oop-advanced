package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_BOUND = 4;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getRandomFigure(){
        int figureNumber = random.nextInt(FIGURE_BOUND);
        String color = colorSupplier.getRandomColor();
        switch (figureNumber){
            case 0:
                return new Square(color, random.nextInt(100));
            case 1:
                return new Rectangle(color, random.nextInt(100), random.nextInt(100));
            case 2:
                return  new RightTriangle(color, random.nextInt(100), random.nextInt(100));
            case 3:
                return new Circle(color, random.nextInt(100));
            case 4:
                return new IsoscelesTrapezoid(color, random.nextInt(100), random.nextInt(100),random.nextInt(100));
            default: break;
        }
        return new Figure();
    }
}
