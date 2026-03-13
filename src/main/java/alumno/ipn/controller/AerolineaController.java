package alumno.ipn.controller;

import alumno.ipn.model.Aerolinea;
import alumno.ipn.view.AerolineaView;

import javax.swing.*;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class AerolineaController {

    private AerolineaView view;

    public AerolineaController(AerolineaView view){

        this.view = view;

        view.Bguardar.addActionListener(e -> guardarAerolinea());
    }

    private void guardarAerolinea(){

        String nombre = view.Tnombre.getText();
        String pais = view.Tpais.getText();
        String fundacion = view.Tfundacion.getText();

        Aerolinea aerolinea = new Aerolinea(nombre,pais,fundacion);

        enviarAerolinea(aerolinea);

        JOptionPane.showMessageDialog(null,"Datos enviados");
    }

    private void enviarAerolinea(Aerolinea aerolinea){

        try{

            URL url = URI.create("https://practica-ii-cmsf.onrender.com").toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type","application/json");
            conn.setDoOutput(true);

            String json = "{"
                    + "\"nombre\":\"" + aerolinea.getNombre() + "\","
                    + "\"pais\":\"" + aerolinea.getPais() + "\","
                    + "\"fundacion\":" + Integer.parseInt(aerolinea.getFundacion())
                    + "}";

            OutputStream os = conn.getOutputStream();
            os.write(json.getBytes());
            os.flush();
            os.close();

            int responseCode = conn.getResponseCode();

            System.out.println("Response Code: " + responseCode);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}