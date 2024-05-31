public class Stroberi extends Tanaman implements Perawatan {
    public Stroberi() {
        this.setMasaHidup(60);
        this.setBerbuah(150);
        this.setPerkembangan(0.35);
    }

    @Override
    public void berkembang() {
        for (int i = 0; i <= getLamaHidup(); i++) {
        
        }
    }
    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public void treatment() {
        this.setPerkembangan(getPerkembangan() + (getPerkembangan()*0.05));

    }

}
