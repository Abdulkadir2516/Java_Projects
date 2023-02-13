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

        int baslangýc = int_random % players.size();

        System.out.println("baþlangýç => " + baslangýc);

        System.out.println("baþlayan => " + players.get(baslangýc));

        int boyut = players.size();

        for (int i = 0; i < boyut; ++i) {

            int rastgele = rnd.nextInt(100);

            int rst = (rastgele + baslangýc) % players.size();
            
            System.out.println("Asýl tahmin sayýlarý  => " + rastgele);
            System.out.println("Oyunda kalan kiþi sayýsý  => " + players.size());

            System.out.println("tahmin sayýlarý  => " + rastgele % players.size());

            baslangýc = rst - 1;// çýkan kiþi den devam etmesi için kullandým yoksa baþtan saymaya balýyor

            System.out.println("Çýkan Kiþi "+ players.get(rst));
            players.remove(rst);

            if (players.size() == 1) {
                System.out.println("Kazanan Kiþi => " + players.get(0));
                break;
            }

        }

    }
}
