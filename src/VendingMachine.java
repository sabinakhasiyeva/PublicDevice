// VendingMachine class
public class VendingMachine extends PublicDevice {
    private DrinkService drinkService;
    private SnackService snackService;

    public VendingMachine(String name, String location) {
        super(name, location);
        this.drinkService = new DrinkService();
        this.snackService = new SnackService();
    }

    public void getService() {
        // Implementation
    }

    public DrinkService getDrinkService() {
        return drinkService;
    }

    public SnackService getSnackService() {
        return snackService;
    }
}
