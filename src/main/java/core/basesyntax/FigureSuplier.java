package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final int MAX_RANDOM_NAUMBER = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_RANGE = 6;
    private Random random = new Random();
    private ColorSuplier colorSuplier = new ColorSuplier();

    public Figure getRandomFigure() {
        int indexShapeFigure = random.nextInt(RANDOM_RANGE);
        switch (indexShapeFigure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            case 5:
            default:
                return getRandomRhombus();
        }
    }

    private Circle getRandomCircle() {
        String color = colorSuplier.getRondomColor();
        int radius = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        return new Circle(radius, color);
    }

    private Square getRandomSquare() {
        String color = colorSuplier.getRondomColor();
        int side = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        return new Square(side, color);
    }

    private RightTriangle getRandomRightTriangle() {
        String color = colorSuplier.getRondomColor();
        int firstLeg = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        int secondLeg = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Rhombus getRandomRhombus() {
        String color = colorSuplier.getRondomColor();
        int angle = new Random().nextInt(89) + 1;
        int side = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        return new Rhombus(angle, side, color);
    }

    private Rectangle getRandomRectangle() {
        String color = colorSuplier.getRondomColor();
        int sideA = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        int sideB = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        return new Rectangle(sideA, sideB, color);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        String color = colorSuplier.getRondomColor();
        int height = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        int sideA = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        int sideC = new Random().nextInt(MAX_RANDOM_NAUMBER) + 1;
        return new IsoscelesTrapezoid(height, sideA, sideC, color);
    }

    public Figure getDafaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.toString());
    }
}
