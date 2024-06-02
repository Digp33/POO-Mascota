package modelo;

import java.util.ArrayList;

public class ArrayGenerico <T> implements IDAOGenerico<T> {

    private ArrayList<T> arrayList = new ArrayList<>();

    @Override
    public void agregar(T dato) {

    }

    @Override
    public void modificar(T dato) {

    }

    @Override
    public T buscar(T dato) {
        return null;
    }

}