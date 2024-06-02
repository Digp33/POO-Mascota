package modelo;

public interface IDAOGenerico<T> {

    public void agregar(T dato);
    public void modificar(T dato);
    public T buscar(T dato);

}
