package EX3;

import java.io.Serializable;
import java.util.Comparator;

public class Price implements Serializable {
    private String productName;
    private String store;
    private double cost;


    public Price(String productName, String store, double cost) {
        this.productName = productName;
        this.store = store;
        this.cost = cost;
    }

    public String getStore() {
        return (String) this.store;
    }

    public String toString() {
        return String.format("Product name is: %s, cost is %f.", this.productName, this.cost);
    }

    public static final Comparator<Price> COMPARE_BY_STORE = new Comparator<Price>() {
        @Override
        public int compare(Price first, Price second) {
            if (first.getStore() == second.getStore()) {
                return 0;
            }
            if (first.getStore() == null) {
                return -1;
            }
            if (second.getStore() == null) {
                return 1;
            }
            return first.getStore().compareTo(second.getStore());
        }
    };

}
