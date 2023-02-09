package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double botomSide;
    private double height;

    public IsoscelesTrapezoid(double topSide, double botomSide, double visota, Color color) {
        this.topSide = topSide;
        this.botomSide = botomSide;
        this.height = visota;
        this.setColor(color);
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public void setBotomSide(double botomSide) {
        this.botomSide = botomSide;
    }

    public void setVisota(double visota) {
        this.height = visota;
    }

    @Override
    public double calculateArea() {
        return (topSide + botomSide) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + String.format("%.2f", calculateArea())
                + " sq.units, top Side: " + topSide
                + " units, botom Side: " + botomSide
                + " units, visota: " + height
                + " units, color: " + getColor().name());
    }
}
