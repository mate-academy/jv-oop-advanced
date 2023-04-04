package core.basesyntax;

class Rectangle extends Figure {
    double sideA;
    double sideB;
    Color color;

    Rectangle(double sideA, double sideB, Color color) {
        name = "Rectangle";
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    String Color() {
        return color.name().toLowerCase();
    }

    @Override
    double Area() {
        double s;
        s = (sideA * sideB);
        return s;
    }

    @Override
    String ShowName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + ShowName() + ", area: " + Area() + " units, side: " + sideA
                + "," + sideB + " units, color: " + Color();
    }
}
