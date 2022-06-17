package core.basesyntax;

public class RightTriangle extends Figure {
    private ColorSupplier cs = new ColorSupplier();
    private String color;
    private double baseLeg;
    private double heightLeg;

    public RightTriangle() {
    }

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.baseLeg = firstLeg;
        this.heightLeg = secondLeg;
        this.color = cs.getRandomColor();
    }

    public double getFirstLeg() {
        return baseLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.baseLeg = firstLeg;
    }

    public double getHeightLeg() {
        return heightLeg;
    }

    public void setHeightLeg(double heightLeg) {
        this.heightLeg = heightLeg;
    }

    @Override
    public void getInfoAboutFigure() {
        System.out.println("Figure: Right Triangle , area: " + ((baseLeg * heightLeg) / 2)
                + ", baseLeg: " + baseLeg + ", heightLeg: " + heightLeg
                + ", color: " + color);
    }
}
