package mariadb.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mariadb.example.entities.Test_table;

@Repository("test_table")
public interface Test_tableRepository extends CrudRepository<Test_table, Integer> {

}
