package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int hightTrapesoid;
    private int downSideTrapesoid;
    private int upSideTrapesoid;
    private String color;

    public IsoscelesTrapezoid(String color, int hightTrapesoid,
                              int downSideTrapesoid, int upSideTrapesoid) {
        this.downSideTrapesoid = downSideTrapesoid;
        this.color = color;
        this.hightTrapesoid = hightTrapesoid;
        this.upSideTrapesoid = upSideTrapesoid;
    }

    public double getArea() {
        double area = (downSideTrapesoid + upSideTrapesoid) / 2
                * hightTrapesoid;
        this.setArea(area);
        return area;
    }

    @Override
    public void paintFigure() {
        System.out.println("Figure : IsoscelesTrapezoid, area : " + getArea()
                + ", hTrapesoid : " + hightTrapesoid
                + ", dowvSideTrapesoid : " + downSideTrapesoid + ", upSideTrapesoid : "
                + upSideTrapesoid + ", color : " + color);
    }
}
