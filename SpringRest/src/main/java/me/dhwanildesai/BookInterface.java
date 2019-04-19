package me.dhwanildesai;
import org.springframework.data.repository.CrudRepository;
public interface BookInterface extends CrudRepository<Book, String> {

//By creating this interface i am getting every bit of CRUD operation to use.


}
