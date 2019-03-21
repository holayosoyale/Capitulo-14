/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacreararchivosecuencial;

 // Fig. 14.19: PruebaCrearArchivoSecuencial.java
 // Prueba de la clase CrearArchivoSecuencial.

 public class PruebaCrearArchivoSecuencial
 {
 public static void main( String args[] )
 {
 CrearArchivoSecuencial aplicacion = new CrearArchivoSecuencial();

 aplicacion.abrirArchivo();
 aplicacion.agregarRegistros();
 aplicacion.cerrarArchivo();
 } // fin de main
 } // fin de la clase PruebaCrearArchivoSecuencial