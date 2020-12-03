package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstKatet;
    private int secondKatet;

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

    public double calculateHypotenuse() {
        return Math.sqrt(firstKatet * firstKatet + secondKatet * secondKatet);
    }

    @Override
    public double calculateArea() {
        double area = (firstKatet * secondKatet) / 2;
        setArea(area);
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + calculateArea()
                + " sq. units, hypotenuse: " + calculateHypotenuse()
                + " units, color: " + getColor());
    }
}
