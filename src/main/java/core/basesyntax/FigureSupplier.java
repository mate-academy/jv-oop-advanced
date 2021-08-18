package core.basesyntax;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int random = (int) Math.ceil(Math.random() * FIGURE_COUNT);
        Figure figure = null;
        switch (random) {
            case 1:
                figure = new Circle("circle",
                            colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new IsoscelesTrapezoid("isosceles trapezoid",
                            colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new Rectangle("rectangle",
                            colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new RightTriangle("right triangle",
                            colorSupplier.getRandomColor());
                break;
            case 5:
                figure = new Square("square",
                            colorSupplier.getRandomColor());
                break;
            default:
                break;
        }
        return figure;
    }
}

