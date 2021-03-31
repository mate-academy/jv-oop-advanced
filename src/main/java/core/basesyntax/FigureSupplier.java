package core.basesyntax;
import java.util.Random;

public class FigureSupplier {
    public final static int NUMFIGURES = 5;
    public final static int MAXLENGTH = 5;
    Random random = new Random();
    public ColorSupplier colorRandom = new ColorSupplier();

    public Figure getFigure() {
        switch (random.nextInt(NUMFIGURES)) {
            case 0 : return getNewSquare();
            case 1 : return getNewRectangle();
            case 2 : return getNewRightTriangle();
            case 3 : return getNewCircle();
            default : return getNewIsoscelesTrapezoid();
        }
    }
    private Circle getNewCircle() {
        int radius = random.nextInt(MAXLENGTH);
        String color = colorRandom.getNewColor();

        return new Circle(radius, color);
    }

    private Square getNewSquare() {
        int side = random.nextInt(MAXLENGTH);
        String color = colorRandom.getNewColor();

        return new Square(side, color);
    }

    private Rectangle getNewRectangle() {
        int sideA = random.nextInt(MAXLENGTH);
        int sideB = random.nextInt(MAXLENGTH);
        String color = colorRandom.getNewColor();

        return new Rectangle(sideA, sideB, color);
    }

    private RightTriangle getNewRightTriangle() {
        int sideA = random.nextInt(MAXLENGTH);
        int sideB = random.nextInt(MAXLENGTH);
        String color = colorRandom.getNewColor();

        return new RightTriangle(sideA, sideB, color);
    }

    private IsoscelesTrapezoid getNewIsoscelesTrapezoid(){
        int hide = random.nextInt(MAXLENGTH);
        int middleLine = random.nextInt(MAXLENGTH);
        String color = colorRandom.getNewColor();

        return new IsoscelesTrapezoid(hide, middleLine, color);
    }
}
