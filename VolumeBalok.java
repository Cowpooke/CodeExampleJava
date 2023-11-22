package Hitung;
public class VolumeBalok extends Persegi {
    private double tinggi;
    public VolumeBalok(double sisi, double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
    }
    public double hitungVolume() {
        return super.hitungLuas() * tinggi;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}