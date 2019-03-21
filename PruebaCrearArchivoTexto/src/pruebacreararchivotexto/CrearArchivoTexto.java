// Uso de la clase Formatter para escribir datos en un archivo de texto.

package pruebacreararchivotexto;
        

import java.io.FileNotFoundException;
 import java.lang.SecurityException;
 import java.util.Formatter;
 import java.util.FormatterClosedException;
 import java.util.NoSuchElementException;
 import java.util.Scanner;
 
  import java.io.File;
 
  public class CrearArchivoTexto
  {
  private Formatter salida; // objeto usado para enviar texto al archivo

  // permite al usuario abrir el archivo
 public void abrirArchivo()
  {
  try
  {
  salida = new Formatter( "clientes.txt" );
  } // fin de try
 catch ( SecurityException securityException )
  {
  System.err.println(
  "No tiene acceso de escritura a este archivo." );
  System.exit( 1 );
  } // fin de catch
 catch ( FileNotFoundException filesNotFoundException )
  {
  System.err.println( "Error al crear el archivo." );
  System.exit( 1 );
  } // fin de catch
 } // fin del método abrirArchivo

  // agrega registros al archivo
 public void agregarRegistros()
  {
  // objeto que se va a escribir en el archivo
 RegistroCuenta registro = new RegistroCuenta();
 
  Scanner entrada = new Scanner( System.in );
 
  System.out.printf( "%s\n%s\n%s\n%s\n\n",
  "Para terminar la entrada, escriba el indicador de fin de archivo ",
  "cuando se le pida que escriba los datos de entrada.",
  "En UNIX/Linux/Mac OS X escriba <ctrl> d y oprima Intro",
  "En Windows escriba <ctrl> z y oprima Intro" );
 
  System.out.printf( "%s\n%s",
  "Escriba el numero de cuenta (> 0), primer nombre, apellido paterno y saldo.",
  "? " );
 
  for (int i = 0; i<=3; i++)  // itera hasta encontrar el indicador de fin de archivo
 {
 try // envía valores al archivo
 {
  // obtiene los datos que se van a enviar
 registro.establecerCuenta( entrada.nextInt() ); // lee el número de cuenta
 registro.establecerPrimerNombre( entrada.next() ); // lee el primer nombre
registro.establecerApellidoPaterno( entrada.next() ); // lee el apellido paterno
 registro.establecerSaldo( entrada.nextDouble() ); // lee el saldo

  if ( registro.obtenerCuenta() > 0 )
  {
  // escribe el nuevo registro
 salida.format( "%d %s %s %.2f\n", registro.obtenerCuenta(),
  registro.obtenerPrimerNombre(), registro.obtenerApellidoPaterno(),
  registro.obtenerSaldo() );
  } // fin de if
 else
  {
  System.out.println(
  "El numero de cuenta debe ser mayor que 0." );
  } // fin de else
 } // fin de try
 catch ( FormatterClosedException formatterClosedException )
  {
  System.err.println( "Error al escribir en el archivo." );
  return;
  } // fin de catch
 catch ( NoSuchElementException elementException )
  {
  System.err.println( "Entrada invalida. Intente de nuevo." );
  entrada.nextLine(); // descarta la entrada para que el usuario intente de nuevo
 } // fin de catch

  System.out.printf( "%s %s\n%s", "Escriba el numero de cuenta (> 0),",
  "primer nombre, apellido paterno y saldo.", "? " );
  }
  } // fin del for

    //id cerrarArchivo() {
       //hrow new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   //
  // fin del método agregarRegistros

  // cierra el file
 public void cerrarArchivo()
  {
  if ( salida != null )
  salida.close();
  } // fin del método cerrarArchivo
} // fin de la clase CrearArchivoTexto

