package sample;

import javafx.beans.property.SimpleStringProperty;

public class Person {
    //atributos
    SimpleStringProperty nombre;
    SimpleStringProperty fecha;
    SimpleStringProperty pendientes;
    SimpleStringProperty estimado;

    // constructor
    public Person(String name, String fe, String pen, String est) {
        this.nombre = new SimpleStringProperty();
        this.fecha = new SimpleStringProperty();
        this.pendientes = new SimpleStringProperty();
        this.estimado = new SimpleStringProperty();

        this.nombre.set(name);
        this.fecha.set(fe);
        this.pendientes.set(pen);
        this.estimado.set(est);
    }

    //getter y setters
    public String getFecha() {
        return this.fecha.get();
    }

    public String getNombre() {
        return this.nombre.get();
    }

    public String getEstimado() {
        return this.estimado.get();
    }

    public String getPendientes() {
        return this.pendientes.get();
    }

    // metodo to string
    @Override
    public String toString() {
        return this.getNombre() + " " + this.getFecha() + " " + this.getEstimado() + "" + getPendientes() ;
    }
}
