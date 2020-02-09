package in.nickjones.onlinebookstore.repository;

import in.nickjones.onlinebookstore.Book;
import in.nickjones.onlinebookstore.BookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

@Configuration
public class RepoConfig  implements RepositoryRestConfigurer {
    @Autowired
    private EntityManager entityManager;

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//        config.exposeIdsFor(Book.class);
//        config.exposeIdsFor(BookCategory.class);
          config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream().map(Type::getJavaType)
          .toArray(Class[]::new));
    }
}
