package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();

        FigureSupplier randFigures = new FigureSupplier();

        int randomFiguresShow = randFigures.getRandomFigure();
        switch (randomFiguresShow) {
            case 1:
                triangle.triangleToShow();
                break;
            case 2:
                triangle.triangleToShow();
                circle.circleToShow();
                break;
            case 3:
                triangle.triangleToShow();
                circle.circleToShow();
                square.squareToShow();
                break;
            case 4:
                triangle.triangleToShow();
                circle.circleToShow();
                square.squareToShow();
                rectangle.rectangleToShow();
                break;
            case 5:
                triangle.triangleToShow();
                circle.circleToShow();
                square.squareToShow();
                rectangle.rectangleToShow();
                trapezoid.trapezoidToShow();
                break;
            default:
                System.out.println("Nothing to show");
        }
    }
}
