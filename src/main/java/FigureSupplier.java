import java.util.Locale;
import java.util.Random;

public class FigureSupplier {
    private static double DEFAULT_CIRCLE_RADIUS = 10;
    private static String DEFAULT_COLOR = "white";
    private static int MAX_RANDOM_FIGURES_QTY = 6;
    private static int MAX_RANDOM_BOUND_LIMIT = 15;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomCircle() {
        Figure circle = new Circle(colorSupplier.getRandomColor(),String.valueOf(Figures.CIRCLE).toLowerCase(Locale.ROOT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return circle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), String.valueOf(Figures.TRAPEZOID),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT), random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return isoscelesTrapezoid;
    }

    public Figure getRandomRectangle() {
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), String.valueOf(Figures.RECTANGLE).toLowerCase(Locale.ROOT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return rectangle;
    }

    public Figure getRandomRhombus() {
        Figure rhombus = new Rhombus(colorSupplier.getRandomColor(), String.valueOf(Figures.RHOMBUS).toLowerCase(Locale.ROOT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return rhombus;
    }

    public Figure getRandomRightTriangle() {
        Figure triangle = new RightTriangle(colorSupplier.getRandomColor(), String.valueOf(Figures.TRIANGLE).toLowerCase(Locale.ROOT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return triangle;
    }

    public Figure getRandomSquare() {
        Figure square = new Square(colorSupplier.getRandomColor(), String.valueOf(Figures.SQUARE).toLowerCase(Locale.ROOT),
                random.nextInt(MAX_RANDOM_BOUND_LIMIT));
        return square;
    }
        public Figure getRandomFigure () {
            int index = random.nextInt(MAX_RANDOM_FIGURES_QTY);
            switch (index) {
                case 1:
                    return getRandomCircle();
                case 2:
                    return getRandomIsoscelesTrapezoid();
                case 3:
                    return getRandomRectangle();
                case 4:
                    return getRandomRhombus();
                case 5:
                    return getRandomRightTriangle();
                default:
                    return getRandomSquare();
            }
        }

        public Figure getDefaultFigure () {
            Figure circle = new Circle(DEFAULT_COLOR, String.valueOf(Figures.CIRCLE).toLowerCase(Locale.ROOT), DEFAULT_CIRCLE_RADIUS);
            return circle;
        }

    }