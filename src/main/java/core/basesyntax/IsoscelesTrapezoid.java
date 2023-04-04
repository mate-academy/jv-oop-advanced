package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    double sideA;
    double sideB;
    double height;
    Color color;

    IsoscelesTrapezoid(double sideA, double sideB, double height, Color color) {
        name = "IsoscelesTrapezoid";
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    String Color() {
        return color.name().toLowerCase();
    }

    @Override
    double Area() {
        double s;
        s = (((sideA + sideB) / 2) * height);
        return s;
    }

    @Override
    String ShowName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + ShowName() + ", area: " + Area()
                + " units, side: " + sideA + "," + sideB + " height: "
                + height + " units, color: " + Color();
    }
}
