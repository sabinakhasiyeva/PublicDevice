// PublicDevice class
public class PublicDevice {
    private String name;
    private String location;
    private boolean isAvailable;

    public PublicDevice(String name, String location) {
        this.name = name;
        this.location = location;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void getService() {
        // Implementation
    }
}


