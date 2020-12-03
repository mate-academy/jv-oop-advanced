package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLine;
    private double secondLine;
    private double height;

    public IsoscelesTrapezoid(String name, Color color,
                              double firstLine, double secondLine, double height) {
        super(name, ((firstLine + secondLine) / 2) * height, color);
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void print() {
        System.out.println("   " + getName() + "   " + getArea()
                + "   " + getColor() + "   " + getHeight());
    }
}
