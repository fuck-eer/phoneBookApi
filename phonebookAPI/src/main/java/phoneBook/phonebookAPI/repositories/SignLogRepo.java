package phoneBook.phonebookAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import phoneBook.phonebookAPI.entity.Authtable;
import phoneBook.phonebookAPI.services.SignLogRepoCustom;

public interface SignLogRepo extends JpaRepository<Authtable, String>,SignLogRepoCustom {

}
