package tds.practica2;


/**
 * 
 * clase que Un producto que consiste en un objeto o servicio que puede
 * ser adquirido por el usuario a traves de un pedido.
 *
 * 
 * @author josloza
 * @author garicat
 * @author carlgom
 *
 */
public class Producto {
	private String identificador;
	private String descripcion;
	private int[] dimensiones;//NO NECESITAN SET PORQUE NO SE DEBERIAN CAMBIAR NINGUN ATRIBUTO
	
	
	/**
	 * Inicializador del producto. Utilizado para crear un nuevo producto en el sistema.
	 *
	 * @param identificador Identificador unico. Ha de ser exclusivo comparado al resto de productos existentes.
	 * @param descripcion Descripci�n inicial del producto
	 * @param dimensiones Dimensiones en los ejes X, Y, Z (en cent�metros) del producto
	 * @throws IllegalArgumentException El identificador introducido no esta entre 1 y 10 caracteres
	 * @throws IllegalArgumentException El identificador introducido esta vacio
	 * @throws IllegalArgumentException El identificador introducido es null
	 * @throws IllegalArgumentException La descripcion introducida esta vacia
	 * @throws IllegalArgumentException La descripcion introducida es null
	 * @throws IllegalArgumentException Las dimensiones introducidas son negativas
	 * @throws IllegalArgumentException Las dimensiones introducidas no son validas
	 * @throws IllegalArgumentException Las dimensiones introducidas son null
	 */
	public Producto(String identificador, String descripcion, int[] dimensiones) {
		
	}
	
	
	
	/**
	 * Recupera el identificador �nico del producto.
	 *
	 * @return identificador �nico
	 */
	public String getIdentificador() {
		return null;
	}
	
	/**
	 * Recupera la descripci�n del producto.
	 *
	 * @return descripci�n del producto
	 */
	public String getDescripcion() {
		return null;
	}
	
	/**
	 * Recupera las dimensiones del producto.
	 *
	 * @return dimensiones en los ejes X, Y, Z (en cent�metros) del producto
	 */
	public int[] getDimensiones() {
		return null;
	}

	
	/**
	 * compara un producto con un objeto
	 * @param o objeto para comparar
	 * @return true si los productos coinciden en identificador, false en caso contrario
	 * 
	 */
	@Override
	public boolean equals(Object o){
		return true;
	}
}
