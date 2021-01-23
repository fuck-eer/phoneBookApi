package phoneBook.phonebookAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import phoneBook.phonebookAPI.entity.Contact;
import phoneBook.phonebookAPI.services.ContactService;

public interface ContactRepository extends JpaRepository<Contact, String>,ContactService {

}
