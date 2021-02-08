package EX2;

import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            ArrayList<Worker> workers = new Type().setWorker();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
