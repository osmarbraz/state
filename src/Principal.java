
import com.state.ui.Player;
import com.state.ui.UI;

public class Principal {

    public static void main(String[] args) {
        //Instancia o jogador
        Player player = new Player();
        //Instancia a GUI e passa o jogador
        UI ui = new UI(player);

        //Inicializa a GUI
        ui.init();
    }
}
