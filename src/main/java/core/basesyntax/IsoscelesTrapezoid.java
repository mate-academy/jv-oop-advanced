package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private int sideBot;
    private int sideHigh;
    private int high;

    public int getSideBot() {
        return sideBot;
    }

    public void setSideBot(int sideBot) {
        this.sideBot = sideBot;
    }

    public int getSideHigh() {
        return sideHigh;
    }

    public void setSideHigh(int sideHigh) {
        this.sideHigh = sideHigh;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    double getArea() {
        return (double) (sideBot + sideHigh) / 2 * high;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + getArea() + " sq. units, sideBot: "
                + sideBot + "units, sideHigh: "
                + sideHigh + " units, color: " + getColor());
    }
}
