/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manages;

import Projects.Project;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ListaProject {
     private ArrayList<Project> projecto;

    public ListaProject() {
        projecto = new ArrayList<Project>();
    }

    public ArrayList<Project> ListarProjects() {
        return projecto;
    }
   
   public void AgregarEstudiante(Project project){
       projecto.add(project);
   }
   
     public void EliminarProyecto(int id){
       projecto.removeIf(project ->project.getId()==id);
       
   }

     public boolean VerificarEstudiante(Project project){
         if(projecto.contains(project)){
             return true;
         }
         return false;
     }
    @Override
    public String toString() {
        return "ListaProyecto" + "Proyecto: " + projecto ;
    }

    
}
