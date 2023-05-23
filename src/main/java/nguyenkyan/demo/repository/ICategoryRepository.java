package nguyenkyan.demo.repository;

import nguyenkyan.demo.enity.Category;
import nguyenkyan.demo.enity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository  extends JpaRepository<Category, Long> {
}
