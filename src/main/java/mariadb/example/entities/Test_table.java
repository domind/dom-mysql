package mariadb.example.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "test_table")
public class Test_table implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String first_name;

	@Column
	private String last_name;

	@Column
	private int number_int;
	
	@Column
	private double number_dec;
	
	@Column
	private java.sql.Date some_date;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getNumber_int() {
		return number_int;
	}

	public void setNumber_int(int number_int) {
		this.number_int = number_int;
	}

	public double getNumber_dec() {
		return number_dec;
	}

	public void setNumber_dec(double number_dec) {
		this.number_dec = number_dec;
	}

	public String getDate() {
		return some_date.toString();
	}

	public void setDate(java.sql.Date date) {
		this.some_date = date;
	}

	

}
