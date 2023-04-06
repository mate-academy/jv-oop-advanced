package core.basesyntax;

class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB, Color color) {
        super(color.name());
        this.setSideA(sideA);
        this.setSideB(sideB);
    }

    @Override
    public double area() {
        double s;
        s = (getSideA() * getSideB());
        return s;
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

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + area()
                + " units, side: " + getSideA() + "," + getSideB()
                + " units, color: " + getColor();
    }
}
