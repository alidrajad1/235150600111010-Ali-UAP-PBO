public abstract class Tanaman {
    private int masaHidup;
    private int lamaHidup;
    private int berbuah;
    private double perkembangan;
    private double prosesBerbuah;

    public int getMasaHidup() {
        return masaHidup;
    }

    public void setMasaHidup(int masaHidup) {
        this.masaHidup = masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public void setLamaHidup(int lamaHidup) {
        this.lamaHidup = lamaHidup;
    }

    public int getBerbuah() {
        return berbuah;
    }

    public void setBerbuah(int berbuah) {
        this.berbuah = berbuah;
    }

    public double getPerkembangan() {
        return perkembangan;
    }

    public void setPerkembangan(double perkembangan) {
        this.perkembangan = perkembangan;
    }

    public double getProsesBerbuah() {
        return prosesBerbuah;
    }

    public void setProsesBerbuah(double prosesBerbuah) {
        this.prosesBerbuah = prosesBerbuah;
    }

    public String Status() {
        if (lamaHidup >= masaHidup) {
            return "Mati";
        } else {
            return "Hidup";
        }
    }

    public abstract void berkembang();

    @Override
    public String toString() {
        return "Masa hidup : " + masaHidup
                + "\nLama hidup: " + lamaHidup
                + "\nBuah dihasilkan: " + berbuah
                + "\nStatus Tanaman: " + Status();
    }
}