package core.basesyntax;

class IsoscelesTrapezoid extends ColorsOfFigures {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;

    }

    @Override
    public double getArea() {
        return (base1 + base2) * 0.5 * height;
    }

    @Override
    public void getToDraw() {
        System.out.println("base1: " + base1 + ", base2: " + base2
                + ", height: " + height);
    }
}
