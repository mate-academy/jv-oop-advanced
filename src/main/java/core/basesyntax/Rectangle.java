package core.basesyntax;

class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private Color color;

    Rectangle(double sideA, double sideB, Color color) {
        name = "Rectangle";
        this.setColor(color);
        this.setSideA(sideA);
        this.setSideB(sideB);
    }

    @Override
    String color() {
        return getColor().name().toLowerCase();
    }

    @Override
    double area() {
        double s;
        s = (getSideA() * getSideB());
        return s;
    }

    @Override
    String showName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + showName() + ", area: " + area() + " units, side: " + getSideA()
                + "," + getSideB() + " units, color: " + color();
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
