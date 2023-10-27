package core.basesyntax.figures;

public abstract class Figure {
    protected String color;
    protected double area;

    protected Figure(String color) {
        this.color = color;
    }

    public void draw() {
        String[] fullClassName = this.getClass().getName().split("\\.");
        String className = fullClassName[fullClassName.length - 1];
        System.out.println("Figure: " + className);
        System.out.println("Color: " + color);
        System.out.println("Area: " + roundDouble(area) + " sq. units");
    }

    public abstract void calcArea();

    public double getCalc() {
        return area;
    }

    public String roundDouble(double num) {
        // Prints out only 2 digits after point for doubles
        return String.format("%.2f", num);
    }
}
