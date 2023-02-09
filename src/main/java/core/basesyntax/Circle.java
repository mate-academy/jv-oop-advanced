package core.basesyntax;

class Circle extends Figure {
    private double radius;
    private final static double PI = 3.14159265359;

    public Circle(double radius, ColorSupplier colorSuppliers) {
        super(colorSuppliers);
        this.radius = radius;
        calcSquare();
    }

    public Circle(double radius) {
        super(default_color);
        this.radius = radius;
        squareCalc();
    }

    private void calcSquare() {
        this.square = PI * radius * radius;
    }

    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: "
                + String.format("%.2f", square) + " sq.units, radius: "
                + String.format("%.2f", radius) + " units, color: " + color);
    }
}
