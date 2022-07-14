public class UserInterface {
    LiquidContainer firstContainer;
    LiquidContainer secondContainer;
    UserInput userInput = new UserInput();
    public UserInterface()
    {
        this.firstContainer = new LiquidContainer();
        this.secondContainer = new LiquidContainer();
    }

    public void start()
    {
        System.out.println("Type add1 amount to add to the first container");
        System.out.println("Type add2 amount to add to the second container");
        System.out.println("Type move1 amount to move from second to the first container");
        System.out.println("Type move2 amount to move from first to the second container");
        System.out.println("Type remove1 amount to remove from the first container");
        System.out.println("Type remove2 amount to remove from the second container");
        System.out.println("Type another word to quit :)");
        label:
        while(true)
        {
            System.out.println("the first container " + this.firstContainer);
            System.out.println("the second container " + this.secondContainer);
            userInput.get();

            switch (userInput.getCommand()) {
                case "add1":



                    firstContainer.addLiquid(userInput.getAmount());
                    break;
                case "add2":
                    secondContainer.addLiquid(userInput.getAmount());
                    break;
                case "move1":
                    firstContainer.moveLiquid(secondContainer, userInput.getAmount());
                    break;
                case "move2":
                    secondContainer.moveLiquid(firstContainer, userInput.getAmount());
                    break;
                case "remove1":
                    firstContainer.removeLiquid(userInput.getAmount());
                    break;
                case "remove2":
                    secondContainer.removeLiquid(userInput.getAmount());
                    break;
                default:
                    break label;
            }



        }


    }
}
