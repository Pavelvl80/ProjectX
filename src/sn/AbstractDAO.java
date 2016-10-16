package sn;

import java.util.List;


public interface AbstractDAO<T> {
    T save(T t);

    T delete(T t);

    T makeInactive(T t);

    T update(T t);

    List<T> getAll();

    List<T> getByUserId(long id);


}