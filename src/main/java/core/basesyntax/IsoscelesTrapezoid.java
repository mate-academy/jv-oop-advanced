package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private ColorSupplier cs = new ColorSupplier();
    private String color;
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, String color) {
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
        this.color = cs.getRandomColor();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getSecondBase() {
        return secondBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void getInfoAboutFigure() {
        System.out.println("Figure: Isosceles Trapezoid , area: "
                + ((firstBase + secondBase) / 2 * height)
                + ", firstBase: " + firstBase + ", secondBase: "
                + secondBase + ", height: " + height
                + ", color: " + color);
    }
}
