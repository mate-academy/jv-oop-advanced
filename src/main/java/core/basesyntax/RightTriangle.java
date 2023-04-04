package core.basesyntax;

class RightTriangle extends Figure {
    private final double sideA;
    private final double sideB;
    private final double sideC;
    private final Color color;

    RightTriangle(double sideA, double sideB, double sideC, Color color) {
        name = "RightTriangle";
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    String Color() {
        return color.name().toLowerCase();
    }

    @Override
    double Area() {
        double s;
        s = ((sideA * sideB) / 2);
        return s;
    }

    @Override
    String ShowName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + ShowName() + ", area: " + Area() + " units, sides: "
                + sideA + "," + sideB + "," + sideC + " units, color: " + Color();
    }
}
