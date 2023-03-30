package es.unirioja.session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CarroCompra implements Serializable {

    private Integer counter;
    private String title;
    private List<String> productos;

    public void addArticulo(String articuloId) {
        if (productos == null) {
            productos = new ArrayList<>();
        }
        productos.add(articuloId);
    }

    public CarroCompra() {
        this.counter = 0;
    }

    public void incrementCounter() {
        counter++;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

}
