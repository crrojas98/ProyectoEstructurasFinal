
package Modelo;

import estructuras.Lista_Enlazada;


public class Curso {
    private String asignatura;
    private int codigo_curso;
    private profesor docente;
    private Lista_Enlazada <estudiante> estudiantes;
    
    public Curso(String asignatura, int codigo_curso){
        this.asignatura = asignatura;
        this.codigo_curso = codigo_curso;
    }
    
    public Curso(String asignatura, int codigo_curso, profesor docente){
        this.asignatura = asignatura;
        this.codigo_curso = codigo_curso;
        this.docente = docente;
    }
    
    public String setDocente (profesor docente){
        if (this.docente == null){
            this.docente = docente;
            return "Asignacion de docente exitosa";
        }else{
            return "Asignacion de docente fallida, ya hay un docente asignado";
        }
    }
    
    public void cambioDocente (profesor docente){
        this.docente = docente;
    }
    
    public void setEstudiante(estudiante estu){
        this.estudiantes.setUltimo(estu);
    }
    
    public void setEstudiantes (Lista_Enlazada<estudiante> estu){
        this.estudiantes.setUnir(estu);
    }
    
    public void eliminarEstudiante(int estudiante){
        this.estudiantes.eliminarNodo(estudiante);
    }

    public String getAsignatura() {
        return asignatura;
    }

    public int getCodigo_curso() {
        return codigo_curso;
    }

    public profesor getDocente() {
        return docente;
    }

    public Lista_Enlazada<estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    
    
}
