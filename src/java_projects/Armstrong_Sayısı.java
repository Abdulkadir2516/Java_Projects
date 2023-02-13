package java_projects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yesil
 */
public class Armstrong_Sayýsý {
    
    // Belirli bir tabanda basamaklarýnýn, sayýnýn basamak sayýsý 
    // kadar kuvvetlerinin toplamýna eþit olan sayýlara Armstrong sayýsý denir.

    public void hesapla(int sayi)
    {
         String sayis = String.valueOf(sayi);

        int böl1 = 1;
        int böl2 = 1;
        int result = 0;
        for (int i = sayis.length(); i > 0; i--) {

            böl1 *= 10;

            int sonuc = (sayi % böl1) - (sayi % (böl1 / 10));

            result += (int) Math.pow(sonuc / böl2, 3);

            böl2 *= 10;
        }

        if (result == sayi) {
            System.out.println(result);
        }
    }
}
