/* Nama : indriana taib
   nim  : 13020210231
 * 
 */
package test0231;


public class Test0231 {

    
    public static void main(String[] args) {
       class Balok extends PersegiPanjang{
int t;
public Balok() {
(h) berisi nilai panjang & lebar yang diperoleh dari konstruktor superclass
persegi panjang serta tinggi=15
}
public Balok(int p, int l, int t) {
(i) berisi nilai pada saat runtime p p, l=l dari konstruktor superclass
persegi panjang t t;
}
(j) buat getter setter class balok
public int volume(){
(k) fungsi untuk menghitung volume balok : p x l x t
}
public void info(){
 (l)fungsi untuk tampil nilai panjang, lebar, tinggi,Luas, dan volume balok

}
}

class PersegiPanjang{
int p, l;
public PersegiPanjang() {
(m) berisi nilai panjang=30 & lebar=20
}
public PersegiPanjang(int p, int l) {
(n) berisi nilai pada saat runtime p p, l=l
 }
(o) buat getter setter class Persegi Panjang public int luas(){
(q) fungsi untuk menghitung luas persegi panjang : p x l
 }
public int keliling(){
(r) fungsi untuk menghitung keliling persegi panjang : 2x (p+l)

    }
    
}
