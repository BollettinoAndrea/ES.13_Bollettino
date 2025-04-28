public class Record {
    private String regione;
    private String anno;
    private String valore;

    public Record(String regione, String anno, String valore) {
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

    public String getAnno() {
        return anno;
    }
    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getValore() {
        return valore;
    }
    public void setValore(String valore) {
        this.valore = valore;
    }

    @Override
    public String toString() {
        return regione + ";" + anno + ";" + valore;
    }
}