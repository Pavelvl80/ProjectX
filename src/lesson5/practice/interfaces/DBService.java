package lesson5.practice.interfaces;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public interface DBService {

    Object save(Object object);

    Object delete(Object object);

    Object update(Object object);
}
