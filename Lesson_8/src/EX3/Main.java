package EX3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 2; i++) {
            try {
                storage.add(reader);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        storage.sort();

        try {
            storage.getProducts(reader);
        }
        catch(HasNoProductException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.getMessage();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
