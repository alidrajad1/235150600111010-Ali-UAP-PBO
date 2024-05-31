public class Tomat extends Tanaman implements Perawatan {
    public Tomat() {
        this.setMasaHidup(100);
        this.setBerbuah(100);
        this.setPerkembangan(0.25);
    }

    @Override
    public void berkembang() {
        for (int i = 0; i <= getLamaHidup(); i++) {
        
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    }

    @Override
    public void treatment() {
        this.setPerkembangan(getPerkembangan() + (getPerkembangan()*0.05));
    }

}
