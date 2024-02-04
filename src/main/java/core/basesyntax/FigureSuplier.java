package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    public static final int FIGURE_COUNT = 4;
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colors = new ColorSupplier();
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colors.getRandomColor();
        switch (figureNumber) {
            case 0:
                int side = random.nextInt(15) + 1;
                return new Square(color, side);
            case 1:
                int horizontalSide = random.nextInt(15) + 1;
                int verticalSide = random.nextInt(15) + 1;
                return new Rectangle(color,horizontalSide,verticalSide);
            case 2:
                int base = random.nextInt(15) + 1;
                int height = random.nextInt(15) + 1;
                int upperSide = random.nextInt(15) + 1;
                return new IsoscelesTrapezoid(color,base, height, upperSide);
            case 3:
                int firstLeg = random.nextInt(15) + 1;
                int secondLeg = random.nextInt(15) + 1;
                return new RightTriangle(color, firstLeg, secondLeg);
            case 4:
                int radius = random.nextInt(15) + 1;
                return new Circle(color,radius);
            default:
                break;
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
