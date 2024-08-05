/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manages;

import Users.User;
import java.util.HashSet;

/**
 *
 * @author fabia
 */
public class ListaUser {
        private HashSet<User> usuario;
    public ListaUser() {
      usuario = new HashSet<>();
    }

    public HashSet<User> ListarUser() {
        return usuario;
    }
    
    public void AgregarUser(User user){
        usuario.add(user);
    }
    
    public User BuscarUser(String id){
                for (User user : usuario) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;

    }
            
    public void EliminarUser(String id){
        usuario.removeIf(User -> User.getId().equals(id));
    }   
    }
