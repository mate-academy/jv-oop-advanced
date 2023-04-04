package core.basesyntax;

class Circle extends Figure {
    private final double radius;
    private final Color color;

    Circle(double radius, Color color) {
        name = "Circle";
        this.color = color;
        this.radius = radius;
    }

    @Override
    String Color() {
        return color.name().toLowerCase();
    }

    @Override
    double Area() {
        return 3.1415 * radius * radius;
    }

    @Override
    String ShowName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + ShowName() + ", area: " + Area()
                + "units, side: " + radius + " units, color: " + Color();
    }
}
