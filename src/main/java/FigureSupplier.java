public class FigureSupplier {
    public static final int MAX_RANDOM_VALUE = 4;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure figure = null;
        int choice = (int) (1 + Math.random() * MAX_RANDOM_VALUE);
        switch (choice) {
            case 1:
                figure = new Circle(colorSupplier.getRandomColor(),
                        (int) (Math.random() * Main.MAX_RANDOM_VALUE));
                break;
            case 2:
                figure = new RightTriangle(colorSupplier.getRandomColor(), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE));
                break;
            case 3:
                figure = new Rectangle(colorSupplier.getRandomColor(), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE));
                break;
            case 4:
                figure = new Square(colorSupplier.getRandomColor(), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE));
                break;
            default:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE), (int) (Math.random() * Main.MAX_RANDOM_VALUE),
                        + (int) (Math.random() * Main.MAX_RANDOM_VALUE));
                break;
        }
        return figure;
    }
}
