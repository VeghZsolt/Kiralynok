package kiralynok;

import java.io.IOException;



public class Kiralynok {
    
    private Tabla tabla;

    public Kiralynok()
    {
        tabla = new Tabla('#');
        megoldasok();
    }
    
    
    public static void main(String[] args) throws IOException {
        Kiralynok kiir = new Kiralynok();
        kiir.megoldasok();
        

    }
    
    public void megoldasok()
    {
        feladat4();
        feladat6();
        feladat9();
    }

    private void feladat4()
    {
        System.out.println("4. feladat: üres tábla:");

        tabla.megjelenit();   
    }

    private void feladat6()
    {
        System.out.println("6. feladat feltoltott tabla:");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }

    private void feladat9()
    {
        System.out.println("9. feladat üres sorok és oszlopok száma");
        System.out.println("sorok szama: " +tabla.uresSorokSzama());
        System.out.println("oszlopok szama: "+ tabla.uresOszlopokSzama());
    }
    
}
