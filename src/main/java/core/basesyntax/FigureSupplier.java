package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure = new Circle();
        int number = random.nextInt(4);
        switch (number) {
            case 0:
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(10));
                figure = square;
                break;
            case 1:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(5));
                figure = circle;
                break;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setHigth(random.nextInt(10));
                rectangle.setWidth(random.nextInt(15));
                figure = rectangle;
                break;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setCatet1(random.nextInt(10));
                rightTriangle.setCatet2(random.nextInt(10));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                figure = rightTriangle;
                break;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setGround1(random.nextInt(10));
                isoscelesTrapezoid.setGround2(random.nextInt(15));
                isoscelesTrapezoid.setHigth(random.nextInt(5));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                figure = isoscelesTrapezoid;
                break;
            default:
                System.out.println("There is no figure");
        }
        /*Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor());
        ball.setNumber(number);
        return ball;*/
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(String.valueOf(Color.WHITE));
        return circle;
    }
}
