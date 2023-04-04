package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;
    private Color color;

    IsoscelesTrapezoid(double sideA, double sideB, double height, Color color) {
        name = "IsoscelesTrapezoid";
        this.setColor(color);
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setHeight(height);
    }

    @Override
    String color() {
        return getColor().name().toLowerCase();
    }

    @Override
    double area() {
        double s;
        s = (((getSideA() + getSideB()) / 2) * getHeight());
        return s;
    }

    @Override
    String showName() {
        return this.name;
    }

    @Override
    public String display() {
        return "Figure: " + showName() + ", area: " + area()
                + " units, side: " + getSideA() + "," + getSideB() + " height: "
                + getHeight() + " units, color: " + color();
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
