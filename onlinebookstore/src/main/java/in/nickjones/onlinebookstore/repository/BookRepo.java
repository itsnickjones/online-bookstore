package in.nickjones.onlinebookstore.repository;

import in.nickjones.onlinebookstore.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
