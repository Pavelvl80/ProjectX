package lesson5.practice.interfaces;

/**
 * Created by Edvard Piri on 14.09.2016.
 */
public class DBObjectService {

    Object save(Object object) {
        System.out.println(object.toString() + " saved");
        return object;
    }

    Object delete(Object object) {
        System.out.println(object.toString() + " deleted");
        return object;
    }

    Object update(Object object) {
        System.out.println(object.toString() + " updated");
        return object;
    }
}
