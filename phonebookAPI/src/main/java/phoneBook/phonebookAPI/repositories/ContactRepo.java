package phoneBook.phonebookAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import phoneBook.phonebookAPI.entity.Contact;
import phoneBook.phonebookAPI.services.ContactRepoCustom;

public interface ContactRepo extends JpaRepository<Contact, String>{

}
