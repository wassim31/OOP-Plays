import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;

public class Inventory {
    private ArrayList<Instrument> instrumentList;

    public Inventory()
    {
        this.instrumentList = new ArrayList<>();
    }

    public void addInstrument(String serialName, double price, InstrumentSpec instrumentSpec)
    {
        Instrument addedInstrument = null;
        if(instrumentSpec instanceof GuitarSpec)
            addedInstrument = new Guitar(serialName,price, (GuitarSpec) instrumentSpec);
        else if(instrumentSpec instanceof MandolinSpec)
            addedInstrument = new Mandolin(serialName,price,(MandolinSpec) instrumentSpec);
        // in case the object is null
        if(addedInstrument.equals(null))
            return;
        else
            instrumentList.add(addedInstrument);



        this.instrumentList.add(addedInstrument);
    }

    public Optional<Instrument> getGuitar(String serialNumber)
    {
        for (Instrument instrument : instrumentList) {
            if (instrument.getSerialNumber().equals(serialNumber))
                return Optional.of(instrument);
        }
        return Optional.empty();
    }

   public ArrayList<Guitar> searchGuitar(GuitarSpec searchGuitar)
    {
        ArrayList<Guitar> matchingGuitars = new ArrayList<>();
        for(int i  = 0 ; i < instrumentList.size() ; i++)
        {
            Guitar guitar = (Guitar) instrumentList.get(i);
            if(guitar.getSpec().matches(searchGuitar))
                matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
    public ArrayList<Mandolin> searchMandolin(MandolinSpec searchMandolin)
    {
        ArrayList<Mandolin> matchingMandolins = new ArrayList<>();
        for(int i  = 0 ; i < instrumentList.size() ; i++)
        {
            Mandolin mandolin = (Mandolin) instrumentList.get(i);
            if(mandolin.getSpec().matches(searchMandolin))
                matchingMandolins.add(mandolin);
        }
        return matchingMandolins;
    }

}
