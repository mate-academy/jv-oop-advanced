package core.basesyntax;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure randomFigure;
        switch ((int) (Math.random() * 5)) {
            case 0:
                randomFigure = new Square(new ColorSupplier().getRandomColor(),
                        (int) (Math.random() * 100) + 1);
                break;
            case 1:
                randomFigure = new Rectangle(new ColorSupplier().getRandomColor(),
                        (int) (Math.random() * 100) + 1,
                        (int) (Math.random() * 100) + 1);
                break;
            case 2:
                randomFigure = new RightTriangle(new ColorSupplier().getRandomColor(),
                        (int) (Math.random() * 100) + 1,
                        (int) (Math.random() * 100) + 1);
                break;
            case 3:
                randomFigure = new Circle(new ColorSupplier().getRandomColor(),
                        (int) (Math.random() * 100) + 1);
                break;
            case 4:
            default:
                randomFigure = new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                        (int) (Math.random() * 100) + 1,
                        (int) (Math.random() * 100) + 1,
                        (int) (Math.random() * 100) + 1);
                break;
        }
        return randomFigure;
    }
}
