package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Circle circle = new Circle();
        circle.setColor("blue");
        circle.setRadius(7);
        Square square = new Square();
        square.setSide(5);
        square.setColor("yellow");
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setHeight(7);
        trapezoid.setBase(15);
        trapezoid.setTop(8);
        trapezoid.setColor("purple");
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("green");
        rectangle.setHeight(7);
        rectangle.setWidth(10);
        Triangle triangle = new Triangle();
        triangle.setColor("red");
        triangle.setBase(10);
        triangle.setHeight(15);
        Figure randomFigure = figureSupplier.getRandomFigure();
        Figure[] figure = {rectangle, triangle, circle, trapezoid, square, triangle, circle};
        for (int i = 0; i < figure.length; i++) {
            if (i < 3) {
                System.out.println(figureSupplier.getRandomFigure().drawRandom());
            }
            else if (i < figure.length - 1) {
                System.out.println(figure[i].draw());
            }
            else {
                System.out.println(figureSupplier.getDefaultFigure().draw());
            }
        }
        System.out.println(randomFigure.drawRandom());
    }
}
