package lesson5.homework.hotel;

/**
 * Created by Edvard Piri on 15.09.2016.
 */
public class DAOSys implements DAO {

    Room[] dbRooms = new Room[10];

    @Override
    public Room save(Room room) {
        for (int i = 0; i < dbRooms.length; i++) {
            if (dbRooms[i] == null) dbRooms[i] = room;
        }
        System.out.println(room.toString() + " saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        for (int i = 0; i < dbRooms.length; i++) {
            if (dbRooms[i].equals(room)) {
                dbRooms = null;
                return true;
            }
        }
        System.out.println(room.toString() + " deleted");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println(room.toString() + " updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        for (int i = 0; i < dbRooms.length; i++) {
            if (dbRooms[i].getId() == id) return dbRooms[i];
        }
        return null;
    }

    @Override
    public Room[] getAll() {
        return dbRooms;
    }
}
