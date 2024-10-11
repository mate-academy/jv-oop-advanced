package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figures getRandomFigure() {
        int randomFigure = random.nextInt(5);

        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();

        switch (randomFigure) {
            case 0:
                int randomSide = random.nextInt(100);
                return new Square(randomColor, randomSide);
            case 1:
                int randomRadius = random.nextInt(100);
                return new Square(randomColor, randomRadius);
            case 2:
                int randomRectagleSide = random.nextInt(100);
                int randomRectagleUpAndDownSide = random.nextInt(100);
                return new Rectangle(randomColor, randomRectagleSide, randomRectagleUpAndDownSide);
            case 3:
                int randomLeftLeg = random.nextInt(100);
                int randomRightLeg = random.nextInt(100);
                return new RightTriangle(randomColor, randomLeftLeg, randomRightLeg);
            case 4:
                int randomSideTrapezoid = random.nextInt(100);
                int randomUpSideTrapezoid = random.nextInt(100);
                int randomDownSideTrapezoid = random.nextInt(100);
                return new IsoscelesTrapezoid(randomColor,
                        randomSideTrapezoid,
                        randomDownSideTrapezoid,
                        randomUpSideTrapezoid);
            default:
                return new Circle("White", 10);
        }
    }

    public Figures getDefaultFigure() {
        return new Circle("White", 10);
    }
}
