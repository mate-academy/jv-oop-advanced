package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int figureValue = (int) (Math.random() * 5) + 1;
        Figure randomFigure;
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (figureValue) {
            case 1:
                randomFigure = new Circle(
                        (int) (Math.random() * 5) + 1);
                break;
            case 2:
                randomFigure = new IsoscelesTrapezoid(
                        (int) (Math.random() * 5) + 1,
                        (int) (Math.random() * 5) + 1,
                        (int) (Math.random() * 5) + 1);
                break;
            case 3:
                randomFigure = new Rectangle(
                        (int) (Math.random() * 5) + 1,
                        (int) (Math.random() * 5) + 1);
                break;
            case 4:
                randomFigure = new RightTriangle(
                        (int) (Math.random() * 5) + 1,
                        (int) (Math.random() * 5) + 1);
                break;
            case 5:
                randomFigure = new Square((int) (Math.random() * 5) + 1);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + figureValue);
        }
        randomFigure.color = colorSupplier.getRandomColor();
        return randomFigure;
    }


}
