
  // Prueba de la clase CrearArchivoTexto.

package pruebacreararchivotexto;
        
 public class PruebaCrearArchivoTexto
  {
  public static void main( String args[] )
  {
  CrearArchivoTexto aplicacion = new CrearArchivoTexto();
 
  aplicacion.abrirArchivo();
  aplicacion.agregarRegistros();
  aplicacion.cerrarArchivo();
  } // fin de main
 } // fin de la clase PruebaCrearArchivoTexto