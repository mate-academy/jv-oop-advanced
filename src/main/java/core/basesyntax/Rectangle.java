package core.basesyntax;

public class Rectangle extends Figure {
    private double smallSide;
    private double bigSide;

    public Rectangle(Color color, double smallSide, double bigSide) {
        super(color);
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    public double getBigSide() {
        return bigSide;
    }

    public double getSmallSide() {
        return smallSide;
    }

    public void setSmallSide(double smallSide) {
        this.smallSide = smallSide;
    }

    public void setBigSide(double bigSide) {
        this.bigSide = bigSide;
    }

    public double getArea() {
        return smallSide * bigSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea()
                + " sq. units, color: " + getColor()
                + ", smallSide " + getSmallSide()
                + ", bigSide " + getBigSide());
    }
}
