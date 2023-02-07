package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double botomSide;
    private double visota;

    public IsoscelesTrapezoid(double topSide, double botomSide, double visota, Color color) {
        this.topSide = topSide;
        this.botomSide = botomSide;
        this.visota = visota;
        this.setColor(color);
    }

    public void setTopSide(double topSide) {
        this.topSide = topSide;
    }

    public void setBotomSide(double botomSide) {
        this.botomSide = botomSide;
    }

    public void setVisota(double visota) {
        this.visota = visota;
    }

    @Override
    public double obtainArea() {
        return (topSide + botomSide) * visota / 2;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: IsoscelesTrapezoid, area: "
                + String.format("%.2f", obtainArea())
                + " sq.units, top Side: " + topSide
                + " units, botom Side: " + botomSide
                + " units, visota: " + visota
                + " units, color: " + getColor().name());
    }
}
