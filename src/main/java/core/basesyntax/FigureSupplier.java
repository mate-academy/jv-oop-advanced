package core.basesyntax;

import java.util.Random;


public class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int choice = random.nextInt(5); // Choose a random figure type

        switch (choice) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),random.nextDouble()*10+1,random.nextDouble()*10+1);
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),random.nextDouble()*10+1,random.nextDouble()*10+1);
            case 3:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),random.nextDouble()*10+1, random.nextDouble()*10+1,random.nextDouble()*10+1);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }
}
