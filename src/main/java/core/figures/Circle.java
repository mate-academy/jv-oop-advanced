package core.figures;

import java.text.DecimalFormat;
import randomizers.sourcerand.Colors;

public class Circle extends Figure {

    private final int radius;

    public Circle(Colors figureColor, int radius) {
        super(figureColor);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: Circle;\n"
                + "Radius: " + radius
                + ";\n" + "Area: " + new DecimalFormat("#.##").format(calculateArea())
                + ";\n" + "Color: " + getFigureColor() + "\n\n";
    }
}
