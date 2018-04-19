package mariadb.example;

/*@SpringBootApplication
public class DomMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DomMysqlApplication.class, args);
	}
}*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import mariadb.example.entities.Test_table;
import mariadb.example.repositories.Test_tableRepository;


@SpringBootApplication
public class Mariadb_Example implements CommandLineRunner {

	@Autowired
	Test_tableRepository test_tableRepo;

	public static void main(String[] args) {
		SpringApplication.run(Mariadb_Example.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println(
				String.format("%-11.11s","Id: ")+
				String.format("%-11.11s","First_name")+
				String.format("%-11.11s","Last_name")+
				String.format("%-11.11s","Number_int")+
				String.format("%-11.11s","Number_dec")+
				String.format("%-11.11s","Date")			
				);
		for(Test_table cell : test_tableRepo.findAll()) {
			System.out.print(String.format("%-11.11s", cell.getId()));
			System.out.print(String.format("%-11.11s", cell.getFirst_name()));
			System.out.print(String.format("%-11.11s", cell.getLast_name()));
			System.out.print(String.format("%-11.11s", cell.getNumber_int()));
			System.out.print(String.format("%-11.11s", cell.getNumber_dec()));
			System.out.print(String.format("%-11.11s", cell.getDate()));
			System.out.println("");
		}
	}
}