import java.util.Scanner;

public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Ders Notunuzu Giriniz: ");
        Matematik = input.nextInt();

        System.out.print("Fizik Ders Notunuzu Giriniz: ");
        Fizik = input.nextInt();

        System.out.print("Kimya Ders Notunuzu Giriniz: ");
        Kimya = input.nextInt();

        System.out.print("Turkce Ders Notunuzu Giriniz: ");
        Turkce = input.nextInt();

        System.out.print("Tarih Ders Notunuzu Giriniz: ");
        Tarih = input.nextInt();

        System.out.print("Muzik Ders Notunuzu Giriniz: ");
        Muzik = input.nextInt();

        int Ortalama = (Matematik + Fizik + Kimya + Tarih + Turkce + Muzik) / 6;
        System.out.println(Ortalama);
        boolean Kosul1 = Ortalama >60;
        boolean Kosul2 = Ortalama <60;
        boolean sonuc = Kosul1 || Kosul2;
        String Durum = sonuc ? "Sınıfı Geçti": "Sınıfta Kaldı";
        System.out.println(Durum);









    }
}
