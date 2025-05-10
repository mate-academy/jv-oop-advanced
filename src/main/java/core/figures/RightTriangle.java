package core.figures;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private final int sideA;
    private final int sideB;

    public RightTriangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return (double) (sideA * sideB) / 2;
    }

    @Override
    public String draw() {
        return "Figure: RightTriangle;\n"
                + "SideA: " + sideA + ", SideB: " + sideB
                + ";\n" + "Area: " + new DecimalFormat("#.##").format(calculateArea())
                + ";\n" + "Color: " + getColor() + "\n\n";
    }
}
