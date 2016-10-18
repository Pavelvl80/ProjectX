package sn;

import java.util.List;


public interface AbstractDAO<T extends Message> {
    T save(T t);

    T update(T t);

    T delete(T t);

    T findById(T t);

    List<T> getAll();

    List<T> getAllWithParameter(List<String> params);

}