package core.basesyntax;

public class FigureSupplier {
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        String randomColor = this.colorSupplier.getRandomColor();
        double radius = Math.random() * 20;
        int randomFigureNumber = (int) (Math.random() * 5);
        double side = Math.random() * 20;
        double firstLeg = Math.random() * 20;
        double height = Math.random() * 20;
        double longSide = Math.random() * 20;
        double shortSide = Math.random() * 20;
        // generate String random color with color supplier   getRandomColor();
        // generate random props for figures
        switch (randomFigureNumber) {
            case 0: {
                figure = new Square(randomColor, side);
            }
                break;
            case 1: {
                figure = new Circle(randomColor, radius);
            }
                break;
            case 2: {
                figure = new IsoscelesTrapezoid(randomColor, longSide, shortSide, height);
            }
                break;
            case 3: {
                figure = new Rectangle(randomColor, longSide, shortSide);
            }
                break;
            case 4: {
                figure = new RightTriangle(randomColor, firstLeg, height);
            }
                break;
            default: {
                System.out.println("The figure is wrong");
            }

        }
        return figure;
    }
}

