public class FigureSupplier {
    static final int MAX_RANDOM_VALUE = 4;

    public Figure getRandomFigure() {
        ColorSupplier color = new ColorSupplier();
        Figure figure = null;
        int choice = (int) (1 + Math.random() * MAX_RANDOM_VALUE);
        switch (choice) {
            case 1:
                figure = new Circle(color.getRandomColor(),
                        (int) (Math.random() * Main.MAX_RANDOM_VALUE));
                break;
            case 2:
                figure = new RightTriangle(color.getRandomColor(), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE));
                break;
            case 3:
                figure = new Rectangle(color.getRandomColor(), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE));
                break;
            case 4:
                figure = new Square(color.getRandomColor(), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE));
                break;
            case 5:
                figure = new IsoscelesTrapezoid(color.getRandomColor(), (int) (Math.random()
                        * Main.MAX_RANDOM_VALUE), (int) (Math.random() * Main.MAX_RANDOM_VALUE),
                        (int) (Math.random() * Main.MAX_RANDOM_VALUE));
                break;
            default:
                break;
        }
        return figure;
    }
}
