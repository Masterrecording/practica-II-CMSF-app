package alumno.ipn;

import alumno.ipn.view.AerolineaView;
import alumno.ipn.controller.AerolineaController;

public class Main {

    public static void main(String[] args) {

        AerolineaView view = new AerolineaView();
        new AerolineaController(view);

    }
}
