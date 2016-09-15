package lesson5.homework.hotel;

/**
 * Created by Edvard Piri on 15.09.2016.
 */
public class DAOSys implements DAO {

    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + " saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println(room.toString() + " deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        //get from db room
        return null; //room
    }
}
