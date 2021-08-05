package com.johnandrade.reto2;

public class PrecioTotal {
    //Atributos y constantes
    private Double totalCafe = 0.0;
    private Double totalCafeNacional = 0.0;
    private Double totalCafeExportacion = 0.0;

    //Contructor
    public PrecioTotal(Cafe[] cafes){
        for(int i = 0; i < cafes.length; i++){
            totalCafe += cafes[i].calcularPrecio();
            if (cafes[i].tipoCafe.equals("nacional")) {
                totalCafeNacional += cafes[i].calcularPrecio();
            }else if(cafes[i].tipoCafe.equals("exportacion")){
                totalCafeExportacion += cafes[i].calcularPrecio();
            }
        }
    }

    //metodo
    public void mostrarTotales(){
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }
}
