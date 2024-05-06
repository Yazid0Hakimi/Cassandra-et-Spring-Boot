package ma.enset.tp1cassandra.repositories;

import ma.enset.tp1cassandra.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
    @Query("SELECT * FROM products WHERE name = ?0 ALLOW FILTERING")
    public Product findByName(String name);
}