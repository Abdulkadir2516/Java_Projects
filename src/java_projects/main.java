

package java_projects;

/**
 *
 * @author yesil
 */
public class main {

    
    public static void main(String[] args) {

        Armstrong_Sayýsý arm = new Armstrong_Sayýsý();
        arm.hesapla(25);
        
        String_Convert replace = new String_Convert();
        replace.convert("Türçe karakterleri ingilizceye dönüþtür");
        
        Circle_Game game = new Circle_Game();
        String[] arr = {"Abdulkadir", "Mehmet", "Kayra", "Erdem", "Metehan", "Gayret", "Zeynep"};
        game.oyun(arr);

    }
    
}
