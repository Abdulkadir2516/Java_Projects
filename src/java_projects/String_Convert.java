/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_projects;

/**
 *
 * @author yesil
 */
public class String_Convert {
    
    public void convert(String metin)
    {
        //ArrayList arr = new ArrayList();
        char[] tr = {'ü','ð','þ','ç','ý','ö'};
        char[] eng = {'u','g','s','c','i','o'};

        char[] arr = metin.toLowerCase().toCharArray();
        
        for (int i=0; i<arr.length; i++) {
            
            for (int j=0; j<tr.length; j++) {
                
                if(tr[j] == arr[i])
                {
                    arr[i] = eng[j];
                }
            }
        }
       
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println("");
        
        
    }
}
