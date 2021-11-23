package core.basesyntax.model;

public class Rectangle extends Figure {
    private int high;
    private int weigh;

    public Rectangle(String figureColor, int high, int weigh) {
        super(figureColor);
        this.weigh = weigh;
        this.high = high;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    @Override
    public double getArea() {
        return high * weigh;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea() + " sq.units," + " high: " + high + " units,"
                + " weigh: " + weigh + " units,"
                + " color: " + getColor());
    }
}
