package core.basesyntax;

class Square extends Figure {
    private final double side;
    private final double diagonal;
    private final Color color;

    Square(double side, double diagonal, Color color) {
        name = "Square";
        this.color = color;
        this.side = side;
        this.diagonal = diagonal;
    }

    @Override
    String Color() {
        return color.name().toLowerCase();
    }

    @Override
    double Area() {
        double s;
        s = (diagonal * diagonal) / 2;
        return s;
    }

    @Override
    String ShowName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + ShowName() + ", area: " + Area() + " units, side: "
                + side + " units, color: " + Color();
    }
}
