package Soal2;

public class Main {
public static void main(String[] args) {
    Sepeda sepeda1 = new Sepeda("S001", "mini bike", 3, 20000);
    Sepeda sepeda2 = new Sepeda("S002", "bmx", 2, 25000);
    Sepeda sepeda3 = new Sepeda("S003", "gunung", 5, 30000);

    sepeda1.tampilkanData();
    sepeda2.tampilkanData();
    sepeda3.tampilkanData();
}
}