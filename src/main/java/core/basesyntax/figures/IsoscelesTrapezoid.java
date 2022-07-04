package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
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

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }



    @Override
    public String toString() {
        return "IsoscelesTrapezoid{"
                + "sideA="
                + sideA
                + ", sideB="
                + sideB
                + ", height="
                + height
                + '}';
    }

    @Override
    public void draw() {
            System.out.println("Figure:"
                    + getClass().getSimpleName()
                    + " , area: "
                    + getArea()
                    + " sq.units, sideA: "
                    + sideA
                    + " units,  sideB:  "
                    + sideB
                    + "  units,"
                    + " height: "
                    + getHeight()
                    + ", color: "
                    + getColor());
        }
    }