package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double botLength;
    private double topLength;
    private double side;

    public IsoscelesTrapezoid(double botLength, double topLength, double side, Color color) {
        this.botLength = botLength;
        this.topLength = topLength;
        this.side = side;
        super.setColor(color);
    }

    public double getBotLength() {
        return botLength;
    }

    public void setBotLength(double botLength) {
        this.botLength = botLength;
    }

    public double getTopLength() {
        return topLength;
    }

    public void setTopLength(double topLength) {
        this.topLength = topLength;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Color getColor() {
        return super.getColor();
    }

    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        double halfPerimeter = (botLength + topLength + 2 * side);
        return Math.sqrt((halfPerimeter - botLength)
                * (halfPerimeter - topLength)
                * Math.pow((halfPerimeter - side), 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getClass().getName().substring(16)
                + ", area: " + String.format("%.3f", getArea()) + " sqr. units, bottom base: "
                + getBotLength() + " units, top base: "
                + getTopLength() + " units, sides length "
                + getBotLength() + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
