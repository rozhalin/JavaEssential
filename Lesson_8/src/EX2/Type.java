package EX2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Type {

    private ArrayList<String> getInfoOfWorker(BufferedReader reader) throws IOException {
        ArrayList<String> info = new ArrayList<>();
        try {
            for (int i = 0; i < 3; i++) {
                info.add(reader.readLine());
            }
        }
        catch(Exception e) {
            info = new ArrayList<>();
            System.out.println("hui");
        }
        return info;
    }

    public ArrayList<Worker> setWorker() throws Exception {
        ArrayList<Worker> workers = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            for (int i = 0; i < 2; i++) {
                ArrayList<String> info = getInfoOfWorker(reader);

                if (info.size() < 3) {
                    throw new Exception("Некорректный ввод данных работника");
                }
                String name = info.get(0);
                String post = info.get(1);
                int year = Integer.parseInt(info.get(2));
                workers.add(new Worker(name, post, year));
            }
        }
        return workers;
    }


}
