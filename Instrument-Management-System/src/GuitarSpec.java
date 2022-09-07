public class GuitarSpec extends InstrumentSpec{

    private int numStrings;

    public GuitarSpec( Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        super(builder,model,type,backWood,topWood);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec searchInstrument)
    {
        if(!super.matches(searchInstrument))
            return false;
        if(!(searchInstrument instanceof GuitarSpec))
            return false;
        if(this.numStrings != ((GuitarSpec) searchInstrument).getNumStrings())
            return false;
        return true;
    }
}
