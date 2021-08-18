import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        String[] nameFigure = new String[]{"circle", "square", "rectangle",
                "right triangle", "isosceles trapezoid"};
        int randomShape = new Random().nextInt(nameFigure.length);
        switch (nameFigure[randomShape]) {
            case "circle":
                return new Circle(nameFigure[randomShape]);
            case "square":
                return new Square(nameFigure[randomShape]);
            case "rectangle":
                return new Rectangle(nameFigure[randomShape]);
            case "right triangle":
                return new Triangle(nameFigure[randomShape]);
            case "isosceles trapezoid":
                return new Trapezoid(nameFigure[randomShape]);
            default:
                return null;
        }
    }
}
