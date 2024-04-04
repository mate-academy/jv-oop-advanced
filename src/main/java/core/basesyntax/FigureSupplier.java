package core.basesyntax;

public class FigureSupplier {

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        switch ((int)(Math.random() * 4)) {
            case 0: {
                figure = new Circle(colorSupplier.getRandomColor(),Math.random() * 100);
            }
            break;
            case 1: {
                figure = new Rectangle(colorSupplier.getRandomColor(),Math.random() * 100,
                        Math.random() * 100);
            }
            break;
            case 2: {
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),Math.random() * 100,
                        Math.random() * 100, Math.random() * 100);
            }
            break;
            case 3: {
                figure = new RightTriangle(colorSupplier.getRandomColor(), Math.random() * 100,
                        Math.random() * 100);
            }
            break;
            case 4: {
                figure = new Square(colorSupplier.getRandomColor(), Math.random() * 100);
            }
            break;
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getDefaultColor(), 10.0);
    }
}
