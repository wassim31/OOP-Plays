public class MandolinSpec extends InstrumentSpec{
    private Style style;

    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood)
    {
        super(builder, model, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    @Override
    public boolean matches(InstrumentSpec searchInstrument)
    {
        if(!super.matches(searchInstrument))
            return false;
        if(!(searchInstrument instanceof MandolinSpec))
            return false;
        if(this.style != ((MandolinSpec) searchInstrument).getStyle())
            return false;
        return true;
    }
}
