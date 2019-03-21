/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacreararchivosecuencial;

 // Fig. 14.21: PruebaLeerArchivoSecuencial.java
 // Este programa prueba la clase ReadSequentialFile.

 public class PruebaLeerArchivoSecuencial
 {
 public static void main( String args[] )
 {
 LeerArchivoSecuencial aplicacion = new LeerArchivoSecuencial();

 aplicacion.abrirArchivo();
 aplicacion.leerRegistros();
 aplicacion.cerrarArchivo();
 } // fin de main
 } // fin de la clase PruebaLeerArchivoSecuencial