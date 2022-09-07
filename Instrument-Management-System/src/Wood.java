public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD;

    public String toString() {
        switch (this) {
            case INDIAN_ROSEWOOD:
                return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian Rosewood";
            default:
                return "unspecified";
        }
    }
    }