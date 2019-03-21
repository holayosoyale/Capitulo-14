/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacreararchivosecuencial;

 // Fig. 14.20: LeerArchivoSecuencial.java
 // Este programa lee un archivo de objetos en forma secuencial
 // y muestra cada registro.
 import java.io.EOFException;
 import java.io.FileInputStream;
 import java.io.IOException;
 import java.io.ObjectInputStream;
//import pruebaleerarchivosecuencial.RegistroCuentaSerializable;

 //import com.deitel.jhtp7.cap14.RegistroCuentaSerializable;

 public class LeerArchivoSecuencial
 {
 private ObjectInputStream entrada;

 // permite al usuario seleccionar el archivo a abrir
 public void abrirArchivo()
 {
 try // abre el archivo
 {
 entrada = new ObjectInputStream(
 new FileInputStream( "clientes.ser" ) );
 } // fin de try
 catch ( IOException ioException )
 {
 System.err.println( "Error al abrir el archivo." );
 } // fin de catch
 } // fin del método abrirArchivo

 // lee el registro del archivo
 public void leerRegistros()
 {
 RegistroCuentaSerializable registro;
 System.out.printf( "%-10s%-15s%-15s%10s\n", "Cuenta",
 "Primer nombre", "Apellido paterno", "Saldo" );

 try // recibe los valores del archivo
 {
 while ( true )
 {
 registro = ( RegistroCuentaSerializable ) entrada.readObject();

 // muestra el contenido del registro
 System.out.printf( "%-10d%-15s%-15s%11.2f\n",
 registro.obtenerCuenta(), registro.obtenerPrimerNombre(),
 registro.obtenerApellidoPaterno(), registro.obtenerSaldo() );
 } // fin de while
 } // fin de try
 catch ( EOFException endOfFileException )
 {
 return; // se llegó al fin del archivo
 } // fin de catch
 catch ( ClassNotFoundException classNotFoundException )
 {
 System.err.println( "No se pudo crear el objeto." );
 } // fin de catch
 catch ( IOException ioException )
 {
 System.err.println( "Error al leer el archivo." );
 } // fin de catch
 } // fin del método leerRegistros

 // cierra el archivo y termina la aplicación
 public void cerrarArchivo()
 {
 try // cierra el archivo y sale
 {
 if ( entrada != null )
 entrada.close();
 System.exit( 0 );
 } // fin de try
 catch ( IOException ioException )
 {
 System.err.println( "Error al cerrar el archivo." );
 System.exit( 1 );
 } // fin de catch
 } // fin del método cerrarArchivo
 } // fin de la clase LeerArchivoSecuencial