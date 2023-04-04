package core.basesyntax;

class RightTriangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private Color color;

    RightTriangle(double sideA, double sideB, double sideC, Color color) {
        name = "RightTriangle";
        this.setColor(color);
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    @Override
    String color() {
        return getColor().name().toLowerCase();
    }

    @Override
    double area() {
        double s;
        s = ((getSideA() * getSideB()) / 2);
        return s;
    }

    @Override
    String showName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + showName() + ", area: " + area() + " units, sides: "
                + getSideA() + "," + getSideB() + "," + getSideC() + " units, color: " + color();
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
