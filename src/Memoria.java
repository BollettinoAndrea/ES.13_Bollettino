import java.io.*;
import java.util.ArrayList;

public class Memoria {
    ArrayList<Record> memoria;

    public Memoria(File file) {
        this.memoria = new ArrayList<>();
    }

    public ArrayList<Record> getMemoria() {
        return memoria;
    }

    public void setMemoria(ArrayList<Record> memoria) {
        this.memoria = memoria;
    }

    public void carica(File file) {
        try (BufferedReader r = new BufferedReader(new FileReader(file))) {
            String s;
            while ((s=r.readLine())!=null){
                String[]Split=s.split(";");
                if(Split.length==3){
                    memoria.add(new Record(Split[1], Integer.parseInt(Split[0]), Double.parseDouble(Split[2])));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
