package EX2;

public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return String.format("Device: manufacturer =%s, price=%d, serialNumber =%s", manufacturer,price,serialNumber);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 && manufacturer.equals(device.manufacturer) && serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + manufacturer.hashCode();
        result = 37 * result + Float.floatToIntBits(price);
        result = 37 * result + serialNumber.hashCode();

        return result;
    }
}
