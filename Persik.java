public class Persik extends Tanaman implements Perawatan {
    public Persik() {
        this.setMasaHidup(180);
        this.setBerbuah(250);
        this.setPerkembangan(0.15);
    }

    @Override
    public void berkembang() {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public void treatment() {
        this.setPerkembangan(getPerkembangan() + (getPerkembangan()*0.025));
    }

}
