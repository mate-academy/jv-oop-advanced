package core.figures;

import java.text.DecimalFormat;
import randomizers.sourcerand.Color;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public String drawFigure() {
        return "Figure: Rectangle;\n"
                + "SideA: " + sideA + ", SideB: " + sideB
                + ";\n" + "Area: " + new DecimalFormat("#.##").format(calculateArea())
                + ";\n" + "Color: " + getColor() + "\n\n";
    }
}
