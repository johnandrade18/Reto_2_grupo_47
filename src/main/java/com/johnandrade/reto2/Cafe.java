package com.johnandrade.reto2;

public class Cafe {

  //Atributos y constantes
  protected Integer PESO_BASE = 5;
  protected char CALIDAD_C_BASE = 'F';
  protected Double PRECIO_BASE = 100.0;
  protected Double precioBase;
  protected Integer peso;
  protected char calidadC;
  protected String tipoCafe;

  //constructor vacio
  public Cafe() {
    this.peso = this.PESO_BASE;
    this.calidadC = this.CALIDAD_C_BASE;
    this.precioBase = this.PRECIO_BASE;
    this.tipoCafe = "cafe";
  }

  public Cafe(Double precioBase, Integer peso) {
    this.peso = peso;
    this.precioBase = precioBase;
    this.calidadC = this.CALIDAD_C_BASE;
    this.tipoCafe = "cafe";
  }

  public Cafe(Double precioBase, Integer peso, char calidadC) {
    this.peso = peso;
    this.precioBase = precioBase;
    this.calidadC = calidadC;
    this.tipoCafe = "cafe";
  }

  //Metodos
  public void comprobarCalidadC(char calidadC) {
    if (calidadC >= 'A' && calidadC <= 'F') {
      this.calidadC = calidadC;
    } else {
      this.calidadC = CALIDAD_C_BASE;
    }
  }

  public Double calcularPrecio() {
    Double adicion = 0.0;
    if (this.calidadC == 'A') {
      adicion += 10;
    } else if (this.calidadC == 'B') {
      adicion += 8;
    } else if (this.calidadC == 'C') {
      adicion += 6;
    } else if (this.calidadC == 'D') {
      adicion += 5;
    } else if (this.calidadC == 'E') {
      adicion += 3;
    } else {
      adicion += 1;
    }

    if (this.peso >= 0 && this.peso < 19) {
      adicion += 10;
    } else if (this.peso > 19 && this.peso < 49) {
      adicion += 50;
    } else if (this.peso > 49 && this.peso < 80) {
      adicion += 80;
    } else if (this.peso > 79) {
      adicion += 100;
    }

    return this.precioBase + adicion;
  }
}
