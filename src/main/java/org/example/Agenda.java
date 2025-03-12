package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Clase que representa una agenda para guardar y gestionar contactos.
 */
public class Agenda {
    /**
     * Lista que almacena todos los contactos de la agenda.
     */
    private List<Persona> contacts;

    /**
     * Constructor para inicializar una nueva agenda vacía.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un contacto nuevo con su teléfono a la agenda.
     * Si el contacto ya existe, añade un nuevo número a su lista.
     *
     * @param name  El nombre del contacto.
     * @param phone El número de teléfono del contacto.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un contacto de la agenda por su nombre.
     *
     * @param name El nombre del contacto a eliminar.
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();
        while (it.hasNext()) {
            Persona c = it.next();
            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica un número de teléfono existente por uno nuevo para un contacto dado.
     *
     * @param name     El nombre del contacto.
     * @param oldPhone El número de teléfono que quieres reemplazar.
     * @param newPhone El nuevo número de teléfono.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();
                int index = phones.indexOf(oldPhone);
                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Devuelve la lista de todos los contactos en la agenda.
     *
     * @return Lista actual de contactos.
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}
