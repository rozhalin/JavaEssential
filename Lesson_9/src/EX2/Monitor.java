package EX2;

import java.util.Objects;

public class Monitor extends Device{
    int resolutionX;
    int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber,int resolutionX, int resolutionY){
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return String.format("Monitor: manufacturer =%s, price=%d, serialNumber =%s, X =%d, Y =%d", manufacturer,price,serialNumber,resolutionX,resolutionY);
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        if (!(this.manufacturer.equals(((Monitor) o).getManufacturer()))) return false;
        if (!(this.serialNumber.equals(((Monitor) o).getSerialNumber()))) return false;
        if (!(this.price == ((Monitor) o).getPrice())) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX && resolutionY == monitor.resolutionY;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + manufacturer.hashCode();
        result = 37 * result + Float.floatToIntBits(price);
        result = 37 * result + serialNumber.hashCode();
        result = 37 * result + (int)resolutionX;
        result = 37 * result + (int)resolutionY;

        return result;
    }
}
