/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_projects;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author yesil
 */
public class Circle_Game {
    
    public void oyun(String[] arr) {

        ArrayList players = new ArrayList();
        
        for (int i = 0; i < arr.length; ++i) {
            players.add(arr[i]);
        }

        Random rnd = new Random();

        int int_random = rnd.nextInt(100);

        int baslang�c = int_random % players.size();

        System.out.println("ba�lang�� => " + baslang�c);

        System.out.println("ba�layan => " + players.get(baslang�c));

        int boyut = players.size();

        for (int i = 0; i < boyut; ++i) {

            int rastgele = rnd.nextInt(100);

            int rst = (rastgele + baslang�c) % players.size();
            
            System.out.println("As�l tahmin say�lar�  => " + rastgele);
            System.out.println("Oyunda kalan ki�i say�s�  => " + players.size());

            System.out.println("tahmin say�lar�  => " + rastgele % players.size());

            baslang�c = rst - 1;// ��kan ki�i den devam etmesi i�in kulland�m yoksa ba�tan saymaya bal�yor

            System.out.println("��kan Ki�i "+ players.get(rst));
            players.remove(rst);

            if (players.size() == 1) {
                System.out.println("Kazanan Ki�i => " + players.get(0));
                break;
            }

        }

    }
}
