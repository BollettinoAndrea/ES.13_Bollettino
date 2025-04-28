public class Record {
    private String regione;
    private int anno;
    private double valore;

    public Record(String regione, int anno, double valore) {
        this.regione = regione;
        this.anno = anno;
        this.valore = valore;
    }

    public String getRegione() {
        return regione;
    }
    public void setRegione(String regione) {
        this.regione = regione;
    }

    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }

    public double getValore() {
        return valore;
    }
    public void setValore(double valore) {
        this.valore = valore;
    }

    @Override
    public String toString() {
        return regione + ";" + anno + ";" + valore;
    }
}