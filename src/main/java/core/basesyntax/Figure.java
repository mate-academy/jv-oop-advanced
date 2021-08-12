package core.basesyntax;

abstract class Figure implements AreaObtain, Draw {
    private String name;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}
