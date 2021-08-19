package core.basesyntax;

//import java.util.Random;

public class FigureSupplier {
    private String figureType;

    public String getFigureType() {
        return figureType;
    }

    //public static final int FIGURE_COUNT = 5;
    //public static final int FIGURE_PARAMETER = 20;
    //private Random random = new Random();

    public ScaleFigure getRandomFigure() {
        //int figureNumber = random.nextInt(FIGURE_COUNT);
        //int figureParameter = random.nextInt(FIGURE_PARAMETER);
        ColorSupplier newColor = new ColorSupplier();
        switch ((int) (Math.random() * 5)) {
            case 1:
                return new Circle((int) (Math.random() * 10), newColor.getRandomColor());
            case 2:
                return new Square((int) (Math.random() * 10), newColor.getRandomColor());
            case 3:
                return new RightTriangle((int) (Math.random() * 10),
                        (int) (Math.random() * 10), newColor.getRandomColor());
            case 4:
                return new Rectangle((int) (Math.random() * 10),
                        (int) (Math.random() * 10), newColor.getRandomColor());
            default:
                return new IsoscelesTrapezoid((int) (Math.random() * 10),
                        (int) (Math.random() * 10), (int) (Math.random() * 10),
                        newColor.getRandomColor());
        }
    }
}
