public class LiquidContainer {
    private final int maxVolume = 100;
    private int actualVolume;

    public LiquidContainer()
    {
        this.actualVolume = 0;
    }

    public int getActualVolume() {
        return actualVolume;
    }

    public void addLiquid(int volume)
    {
        if(this.actualVolume >= this.maxVolume) {
            System.out.println("The Container is full");
        }
        else
            this.actualVolume+=volume;
    }

    public void removeAllLiquid()
    {
        if(this.actualVolume == 0)
            System.out.println("It's empty");
        else
            this.actualVolume = 0;
    }
    public void removeLiquid(int amount)
    {
        if(this.actualVolume == 0)
            System.out.println("It's empty");
        else
           this.actualVolume-=amount;
    }

/*
    public void moveLiquidFrom(LiquidContainer secondContainer, int amount)
    {
        if(this.actualVolume >= this.maxVolume)
            System.out.println("The Container is full");
        else if(this.actualVolume + amount > 100)
            System.out.println("The container is full enough to handle the moved amount of liquid");
        else
        {
            this.actualVolume+=secondContainer.getActualVolume();
            secondContainer.removeLiquid(amount);
        }
    }
*/
    public void moveLiquid(LiquidContainer secondContainer, int amount) {
        if (this.actualVolume == 0)
            System.out.println("it's empty");
        else if (secondContainer.getActualVolume() == this.maxVolume)
            System.out.println("the second container is full");
        else if(amount > this.actualVolume)
            System.out.println("it doesn't have that much liquid");
        else
        {
            secondContainer.addLiquid(amount);
            this.removeLiquid(amount);
        }

    }

    public String toString()
    {
        return "contains " + this.actualVolume + "/100 ";
    }

}
