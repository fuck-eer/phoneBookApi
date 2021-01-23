package phoneBook.phonebookAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import phoneBook.phonebookAPI.entity.Connection;
import phoneBook.phonebookAPI.services.ConnectionRepoCustom;

public interface ConnectionRepo extends JpaRepository<Connection, String>,ConnectionRepoCustom {

}
