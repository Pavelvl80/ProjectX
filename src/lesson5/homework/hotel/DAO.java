package lesson5.homework.hotel;

/**
 * Created by Edvard Piri on 15.09.2016.
 */
public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);

}
