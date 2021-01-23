package phoneBook.phonebookAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import phoneBook.phonebookAPI.entity.Connection;

public interface ConnectionRepo extends JpaRepository<Connection, String> {

}
