package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una persona con un nombre y lista de teléfonos.
 */
public class Persona {

    /** Nombre de la persona. */
    private String name;

    /** Lista de teléfonos asociados. */
    private List<String> phones;

    /**
     * Constructor que crea una persona con un nombre y un teléfono inicial.
     * 
     * @param name  El nombre de la persona.
     * @param phone El número de teléfono inicial.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Devuelve el nombre actual de la persona.
     * 
     * @return El nombre actual de la persona.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Establece un nuevo nombre para la persona.
     * 
     * @param name El nuevo nombre de la persona.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la lista de teléfonos asociados a la persona.
     * 
     * @return Lista de teléfonos.
     */
    public List<String> getPhones() {
        return this.phones;
    }

    /**
     * Establece una nueva lista de teléfonos para la persona.
     * 
     * @param phones La nueva lista de números de teléfono.
     */
    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}
