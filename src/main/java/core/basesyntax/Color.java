package core.basesyntax;

public enum Color {
    RED("red"),
    YELLOW("yellow"),
    BLUE("blue"),
    BLACK("black"),
    WHITE("white"),
    GREEN("green"),
    ORANGE("orange");

    private final String name;

    Color(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
