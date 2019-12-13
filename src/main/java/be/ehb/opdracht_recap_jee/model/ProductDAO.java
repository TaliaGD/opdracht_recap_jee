package be.ehb.opdracht_recap_jee.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository<Product, Integer> {
   // @Query("SELECT b FROM Product b ORDER BY b.prijs DESC")
  //  Iterable <Product> findAllChronological();
}






