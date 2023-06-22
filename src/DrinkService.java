import java.util.List;

// DrinkService class
public class DrinkService {
    private int amount;
    private List<Type> type;

    public DrinkService() {
        // Implementation
    }

    public int getAmount() {
        return amount;
    }

    public List<Type> getType() {
        return type;
    }

    public void getCoffee() {
        // Implementation
    }

    public void getTea() {
        // Implementation
    }

    public void getWater() {
        // Implementation
    }
}

// Type enum
enum Type {
    Hot,
    Cold
}

