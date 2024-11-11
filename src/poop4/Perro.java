/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author estudiante
 */
public class Perro {
    String color;
    String pelaje;
    int tamaño;
    String raza;
    int edad;
    float x;
    float y;
    float z;
    
    public Perro (){
        color= null;
        pelaje = null;
        tamaño = 0;
        raza = null;
        edad = 0;
        x = 0;
        y = 0;
        z = 0;
    }
    
    public Perro (String color, String pelaje, int tamaño, String raza, int edad, float x, float y, float z){
        this.color = color;
        this.pelaje = pelaje;
        this.tamaño = tamaño;
        this.raza = raza;
        this.edad = edad;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public void imprimePerro(){
        System.out.println("color: "+color+ ", pelaje: "+pelaje+ ", tamaño: "+tamaño+ ", raza: "+raza+", edad: "+edad);
    }
    
    public void jugar(){
        System.out.println("guaf guaf");
    }
    
    public boolean comer(){
        System.out.println("Estoy comiendo");
        return true;
    }
    
    public void correr(){
        System.out.println("corro en el parque");

    }
    
    public void morder(){
        System.out.println("grrrr");
    }
    
    public void saltar(float x, float y, float z){
        System.out.println("Me movi a: "+x+", "+y+", "+z);
    } 
}
