/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Derek
 */
public class Triangulo {
    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float calcularArea() {
        return (base * altura) / 2;
    }

    public float calcularPerimetro() {
        return 3 * base;
    }

    public void Angulos() {
        System.out.println("Un angulo es de 90.");
        System.out.println("Dos angulos que se tienen que calcular");
    }
}