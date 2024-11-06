
package PaqueteEjercicio1;

/**
 *
 * @author Daniel
 */
class Ejercicio1_Producto {
    String nombre;
    double precio;
    int stock;

    Ejercicio1_Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    void mostrarInfo(){
        System.out.println("nombre del producto: " + nombre + ", precio: " + precio + ", stock: " + stock);
    }
}
