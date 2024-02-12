package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int arraySize = 5; // You can change this to 3 if needed
        Figure[] figures = new Figure[arraySize];

        ColorSupplier colorSupplier = new ColorSupplier();

        for (int i = 0; i < arraySize; i++) {
            String color = colorSupplier.getRandomColor();

            switch (i % 5) {
                case 0:
                    figures[i] = new Circle(Figure.FigureSupplier.DEFAULT_RADIUS,
                            Figure.FigureSupplier.DEFAULT_COLOR);
                    break;
                case 1:
                    figures[i] = new IsoscelesTrapezoid(
                            Figure.FigureSupplier.DEFAULT_BASE_ONE,
                            Figure.FigureSupplier.DEFAULT_BASE_TWO,
                            Figure.FigureSupplier.DEFAULT_HEIGHT,
                            Figure.FigureSupplier.DEFAULT_COLOR);
                    break;
                case 2:
                    figures[i] = new Rectangle(
                            Figure.FigureSupplier.DEFAULT_WIDTH,
                            Figure.FigureSupplier.DEFAULT_HEIGHT,
                            Figure.FigureSupplier.DEFAULT_COLOR);
                    break;
                case 3:
                    figures[i] = new RightTriangle(
                            5,
                            10,
                            color);
                    break;
                case 4:
                    figures[i] = new Square(
                            4,
                            color);
                    break;
                default:
                    // Handle default case or throw an exception if needed
                    break;
            }
        }

        for (Figure figure : figures) {
            if (figure != null) {
                figure.draw();
            }
        }
    }
}
