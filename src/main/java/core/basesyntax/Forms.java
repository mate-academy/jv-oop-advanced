package core.basesyntax;

public enum Forms {
    CIRCLE("CIRCLE"),
    RECTANGLE("RECTANGLE"),
    SQUARE("SQUARE"),
    TRAPEZOID("TRAPEZOID"),
    TRIANGLE("TRIANGLE");
    private String nameForm;

    Forms(String form) {
        this.nameForm = form;
    }

    public String getForm() {
        return nameForm;
    }
}
