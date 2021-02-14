package EX3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Storage {

    private ArrayList<Price> stack = new ArrayList<>();

    public void add(BufferedReader reader) throws IOException {
        stack.add(createPrice(reader));
    }

    public void sort() {
        Collections.sort(stack,Price.COMPARE_BY_STORE);
    }

    private Price createPrice(BufferedReader reader) throws IOException{
        String productName = "";
        String store = "";
        double cost = 0.0;
            System.out.println("Type product name");
            productName = reader.readLine();
            System.out.println("Type store where is product");
            store = reader.readLine();
            System.out.println("Type product cost");
            cost = Double.parseDouble(reader.readLine());
        return new Price(productName,store,cost);
    }

    public void getProducts(BufferedReader reader) throws HasNoProductException, IOException {
        String store = "";
            System.out.println("Type store which you want to see products");
            store = reader.readLine();
        boolean isEmpty = true;
        for (Price p : stack) {
            String tempStore = p.getStore();
            if (store.equals(tempStore)) {
                System.out.println(p.toString());
                isEmpty = false;
            }
        }
        if (isEmpty) {
            throw new HasNoProductException("There aren't any products in this store.");
        }
    }

}
