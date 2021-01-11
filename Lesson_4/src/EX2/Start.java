package EX2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Start {

    public static void main(String[] args) throws Exception{
        String file = getPath();
        Extension extension = getExtension(file);
        AbstractHandler handler = createHandler(extension);

        handler.create();
        handler.open();
        handler.change();
        handler.save();
    }

    public static String getPath() throws Exception{
        String path = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            path = reader.readLine();
        }
        return path;
    }

    public static Extension getExtension(String path) {
        Extension ext = null;
        int lastIndex = path.split("\\.").length-1;
        String extension = path.split("\\.")[lastIndex];
        switch (extension.toLowerCase()) {
            case ("xml"):
                ext = Extension.XML;
                break;
            case ("doc"):
                ext = Extension.DOC;
                break;
            case ("txt"):
                ext = Extension.TXT;
                break;
        }
        return ext;
    }

    public static AbstractHandler createHandler(Extension ext) {
        AbstractHandler handler = null;
        switch (ext) {
            case XML:
                handler = new XMLHandler();
                break;
            case DOC:
                handler = new DOCHandler();
                break;
            case TXT:
                handler = new TXTHandler();
                break;
        }
        return handler;
    }
}
