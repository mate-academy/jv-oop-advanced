package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int hightTrapesoid = 22;
    private int downSideTrapesoid = 50;
    private int upSideTrapesoid = 20;
    private String color = Colors.YELLOW.name();

    public double getArea() {
        double area = (downSideTrapesoid + upSideTrapesoid) / 2 * hightTrapesoid;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setDownSideTrapesoid(int downSideTrapesoid) {
        this.downSideTrapesoid = downSideTrapesoid;
    }

    public void setHightTrapesoid(int hightTrapesoid) {
        this.hightTrapesoid = hightTrapesoid;
    }

    public void setUpSideTrapesoid(int upSideTrapesoid) {
        this.upSideTrapesoid = upSideTrapesoid;
    }
}
