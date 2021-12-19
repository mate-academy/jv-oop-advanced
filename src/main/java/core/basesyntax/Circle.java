package core.basesyntax;

public class Circle extends Figure implements FigureInterface, DrawFigure {
    private static final int EXPONENTIATION = 2;
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getFigureArea() {
        return Math.PI * Math.pow(radius, EXPONENTIATION);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Circle"
                + "\n"
                + "Figure Area: "
                + getFigureArea()
                + "\n"
                + "Radius: "
                + radius
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

    @Override
    public String toString() {
        return "Figure: "
                + "Circle"
                + "\n"
                + "Figure Area: "
                + getFigureArea()
                + "\n"
                + "Radius: "
                + radius
                + "\n"
                + "Color: "
                + getColor()
                + "\n";
    }

}
