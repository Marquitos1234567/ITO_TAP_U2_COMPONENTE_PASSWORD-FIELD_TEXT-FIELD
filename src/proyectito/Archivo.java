/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yo
 */
    public class Archivo {
        public boolean valid;
        ArrayList <Usuario> personas= new <Usuario> ArrayList();  

    public Archivo() {
        this.ventana = new inicioCorrecto(new javax.swing.JFrame(), true);
    }
    public void agregar(Usuario p){ 
        personas.add(p);
    }
    public void eliminar(Usuario p){
        personas.remove(p);   
    }
    public void eliminar(int x){
        personas.remove(x);   
    }
 
    public void guardarGeneral() throws java.io.IOException {
    FileWriter archivo=new FileWriter("ArchivoGeneral.txt");
    BufferedWriter b=new BufferedWriter(archivo);
    String cad="";    
    for(int x=0; x<personas.size(); x++){
        cad=personas.get(x).toString();         
        b.write(cad);
        b.write("\n");  
    }
        b.close();
    }
    
    private final inicioCorrecto ventana;
    public void validarContraseña(String usu,String contra) throws FileNotFoundException, IOException{
        File archivoEntrada= new File("ArchivoGeneral.txt");
        FileReader lector=new FileReader(archivoEntrada);
        BufferedReader br = new BufferedReader(lector);  
   
        for(int x=0; x<1000; x++){
            String usuario=br.readLine();
            String[]palabras=usuario.split(" ");
            if(palabras[3].equals(usu)&& palabras[4].equals(contra)){                  
                ventana.setVisible(true);
                valid=true;
                //abrir una ventana con el siguiente menú del usuario
                x=1000;
            } else {
                valid=false;
                JOptionPane.showMessageDialog(null, "Inicio de sesión fallido, verifique sus datos");  
            }
        } 
    }
}