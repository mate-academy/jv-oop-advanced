package core.basesyntax;

public class FigureSupplier {
    public Figure figureGenerator() {
        int randomNumber1 = (int) (Math.random() * (6 - 1)) + 1;
        int randomNumber2 = (int) (Math.random() * (10 - 1)) + 1;
        int randomNumber3 = (int) (Math.random() * (15 - 1)) + 1;
        switch (randomNumber1) {
            case 1:
                return new Circle(ColorSupplier.getColour(), randomNumber2);
            case 2:
                return new Square(ColorSupplier.getColour(), randomNumber3);
            case 3:
                return new RightTriangle(ColorSupplier.getColour(), randomNumber2);
            case 4:
                return new Rectangle(ColorSupplier.getColour(), randomNumber2, randomNumber3);
            case 5:
                return new IsoscelesTrapezoid(ColorSupplier.getColour(),
                           randomNumber2, randomNumber3);
            default:
                return new Circle(ColorSupplier.getColour(), randomNumber2);
        }
    }
}
