package org.example;

import java.util.List;

/**
 * Interfaz que define las operaciones básicas de una agenda.
 */
public interface IAgenda {

    /**
     * Añade un contacto o un número de teléfono a la agenda.
     * @param name Nombre del contacto.
     * @param phone Número de teléfono del contacto.
     */
    void addContact(String name, String phone);

    /**
     * Elimina un contacto de la agenda por su nombre.
     * @param name Nombre del contacto a eliminar.
     */
    void removeContact(String name);

    /**
     * Modifica un número de teléfono de un contacto.
     * @param name Nombre del contacto.
     * @param oldPhone Número de teléfono actual.
     * @param newPhone Número de teléfono nuevo.
     */
    void modifyPhoneNumber(String name, String oldPhone, String newPhone);

    /**
     * Devuelve todos los contactos guardados en la agenda.
     * @return Lista de contactos.
     */
    List<Persona> getContacts();
}
