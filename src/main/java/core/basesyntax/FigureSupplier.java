package core.basesyntax;

public class FigureSupplier {

    public static Figure getRandomFigure() {
        int random = (int) (Math.random() * 5 + 1);
        Figure figure = null;

        int optionalLength = (int) (Math.random() * 25 + 1);
        int firstSide = (int) (Math.random() * 25 + 1);
        int secondSide = (int) (Math.random() * 25 + 1);
        double hypotenuse = Math.sqrt(firstSide * firstSide + secondSide * secondSide);

        switch (random) {
            case 1:
                figure = new Circle(optionalLength,
                        ColorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(firstSide, secondSide, hypotenuse,
                        ColorSupplier.getRandomColor());
                break;
            case 3:
                figure = new IsoscelesTrapezoid(firstSide, secondSide, optionalLength,
                        ColorSupplier.getRandomColor());
                break;
            case 4:
                figure = new Rectangle(firstSide, secondSide,
                        ColorSupplier.getRandomColor());
                break;
            case 5:
                figure = new Square(firstSide,
                        ColorSupplier.getRandomColor());
                break;
            default:
        }
        
        return figure;
    }
}
