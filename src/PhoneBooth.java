// PhoneBooth class
public class PhoneBooth extends PublicDevice {
    private String phoneNumber;

    public PhoneBooth(String name, String location, String phoneNumber) {
        super(name, location);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void makeCall() {
        // Implementation
    }

    public void endCall() {
        // Implementation
    }
}
