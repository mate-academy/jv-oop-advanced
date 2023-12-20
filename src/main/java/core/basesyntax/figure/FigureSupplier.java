package core.basesyntax.figure;

import java.util.Random;

public class FigureSupplier {
    private final int BOUNDMAX = 20;
    private final int BOUNDMIN = 1;
    private final Random random = new Random();
    private int indexFigureName;

    public Figure getRandomFigure() {
        indexFigureName = random.nextInt(FigureName.values().length);
        switch (FigureName.values()[indexFigureName]) {
            case Circle:
                double radius = random.nextInt(BOUNDMIN, BOUNDMAX);
                return new Circle(radius);
            case IsoscelesTrapezoid:
                double sideFirst = random.nextInt(BOUNDMIN, BOUNDMAX);
                double sideSecond = random.nextInt(BOUNDMIN, BOUNDMAX);
                double height = random.nextInt(BOUNDMIN, BOUNDMAX);
                return new IsoscelesTrapezoid(sideFirst, sideSecond, height);
            case Rectangle:
                double sideBasis = random.nextInt(BOUNDMIN, BOUNDMAX);
                height = random.nextInt(BOUNDMIN, BOUNDMAX);
                return new Rectangle(sideBasis, height);
            case RightTriangle:
                double firstLeg = random.nextInt(BOUNDMIN, BOUNDMAX);
                double secondLeg = random.nextInt(BOUNDMIN, BOUNDMAX);
                return new RightTriangle(firstLeg, secondLeg);
            case Square:
                double side = random.nextInt(BOUNDMIN, BOUNDMAX);
                return new Square(side);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white);
    }
}
