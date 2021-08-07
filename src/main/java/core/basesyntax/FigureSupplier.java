package core.basesyntax;

import static core.basesyntax.MainApp.FIGURE_COUNT;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int figureValue = (int) (Math.random() * FIGURE_COUNT) + 1;
        Figure randomFigure;
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        switch (figureValue) {
            case 1:
                randomFigure = new Circle(
                        (int) (Math.random() * FIGURE_COUNT) + 1,
                        color);
                break;
            case 2:
                randomFigure = new IsoscelesTrapezoid(
                        (int) (Math.random() * FIGURE_COUNT) + 1,
                        (int) (Math.random() * FIGURE_COUNT) + 1,
                        (int) (Math.random() * FIGURE_COUNT) + 1,
                        color);
                break;
            case 3:
                randomFigure = new Rectangle(
                        (int) (Math.random() * FIGURE_COUNT) + 1,
                        (int) (Math.random() * FIGURE_COUNT) + 1,
                        color);
                break;
            case 4:
                randomFigure = new RightTriangle(
                        (int) (Math.random() * FIGURE_COUNT) + 1,
                        (int) (Math.random() * FIGURE_COUNT) + 1,
                        color);
                break;
            case 5:
                randomFigure = new Square(
                        (int) (Math.random() * FIGURE_COUNT) + 1,
                        color);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + figureValue);
        }
        return randomFigure;
    }
}
