package java_projects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yesil
 */
public class Armstrong_Say�s� {
    
    // Belirli bir tabanda basamaklar�n�n, say�n�n basamak say�s� 
    // kadar kuvvetlerinin toplam�na e�it olan say�lara Armstrong say�s� denir.

    public void hesapla(int sayi)
    {
         String sayis = String.valueOf(sayi);

        int b�l1 = 1;
        int b�l2 = 1;
        int result = 0;
        for (int i = sayis.length(); i > 0; i--) {

            b�l1 *= 10;

            int sonuc = (sayi % b�l1) - (sayi % (b�l1 / 10));

            result += (int) Math.pow(sonuc / b�l2, 3);

            b�l2 *= 10;
        }

        if (result == sayi) {
            System.out.println(result);
        }
    }
}
