public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;

    public Builder getBuilder() {
        return builder;
    }

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    public boolean matches(InstrumentSpec searchInstrument)
    {
        boolean test = true;
        if (searchInstrument.getBuilder() != this.getBuilder())
            test = false;
        String model = searchInstrument.getModel();
        if ((model != null) && (!model.equals("")) && (!model.equals(this.getModel())))
            test = false;
        if (searchInstrument.getType() != this.getType())
            test = false;
        if (searchInstrument.getBackWood() != this.getBackWood())
            test = false;
        if (searchInstrument.getTopWood() != this.getTopWood())
            test = false;
        return test;
    }
    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

}
