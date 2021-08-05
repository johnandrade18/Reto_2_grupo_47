package com.johnandrade.reto2;

public class CafeExportacion extends Cafe {
    //Atributos y constantes
    private Integer CIF_BASE = 20;
    private boolean VERDE = false;
    private Integer cif;
    private boolean verde;

    //Contructores CafeExportacion
    public CafeExportacion(){
        this.peso = this.PESO_BASE;
        this.precioBase = this.PRECIO_BASE;
        this.calidadC = this.CALIDAD_C_BASE;
        this.cif = this.CIF_BASE;
        this.verde = this.VERDE;
        this.tipoCafe = "exportacion";
    }

    public CafeExportacion(Double precioBase, Integer peso){
        this.peso = peso;
        this.precioBase = precioBase;
        this.calidadC = this.CALIDAD_C_BASE;
        this.cif = this.CIF_BASE;
        this.verde = this.VERDE;
        this.tipoCafe = "exportacion";
    }

    public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, boolean verde){
        this.peso = peso;
        this.precioBase = precioBase;
        this.calidadC = calidadC;
        this.cif = cif;
        this.verde = verde;
        this.tipoCafe = "exportacion";
    }

    //metodos
    public Double calcularPrecio(){
        Double adicion = 0.0;
        adicion = super.calcularPrecio();
        if (this.verde == true) {
            adicion += 50;
        }
        if (this.cif > 40) {
            adicion += this.precioBase * 0.3;
        }
        return adicion;
    }  
}
