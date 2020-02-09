package in.nickjones.onlinebookstore.repository;

import in.nickjones.onlinebookstore.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCategory",path="book-category")
public interface BookCategoryRepo extends JpaRepository<BookCategory,Long> {
}
