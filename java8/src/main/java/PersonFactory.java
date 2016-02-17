/**
 * Created by Ilya on 15.02.2016.
 */
public interface PersonFactory<P extends Person> {
    P create(String firstName,String lastName);
}
