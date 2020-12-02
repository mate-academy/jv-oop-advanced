package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstKatet;
    private int secondKatet;
    private double hypotenuse;

    public RightTriangle() {
    }

    public RightTriangle(int firstKatet, int secondKatet) {
        this.firstKatet = firstKatet;
        this.secondKatet = secondKatet;
    }

    public int getFirstKatet() {
        return firstKatet;
    }

    public void setFirstKatet(int firstKatet) {
        this.firstKatet = firstKatet;
    }

    public int getSecondKatet() {
        return secondKatet;
    }

    public void setSecondKatet(int secondKatet) {
        this.secondKatet = secondKatet;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void calculateHypotenuse() {
        hypotenuse = Math.sqrt(firstKatet * firstKatet + secondKatet * secondKatet);
    }

    @Override
    public void calculateArea() {
        setArea((firstKatet * secondKatet) / 2);
    }

    @Override
    public void doAllCalculations() {
        calculateHypotenuse();
        calculateArea();
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + getArea()
                + " sq. units, hypotenuse: " + hypotenuse
                + " units, color: " + getColor());
    }
}
