package Modelo;

import java.util.ArrayList;

public class GestionEstudiantes {
    private ArrayList<Estudiante> estudiantes;

    public GestionEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void guardar(Estudiante e) {
        estudiantes.add(e);
    }

    public void agregarEstudiante(Estudiante e) {
        guardar(e);
    }

    public Estudiante buscar(String carnet) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCarnet().equalsIgnoreCase(carnet)) {
                return estudiante;
            }
        }
        return null;
    }

    public Estudiante buscarEstudiante(String carnet) {
        return buscar(carnet);
    }

    public boolean modificar(String carnet, Estudiante e) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCarnet().equalsIgnoreCase(carnet)) {
                estudiantes.set(i, e);
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String carnet) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCarnet().equalsIgnoreCase(carnet)) {
                estudiantes.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarEstudiante(String carnet) {
        return eliminar(carnet);
    }
}