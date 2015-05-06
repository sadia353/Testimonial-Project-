package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class App implements CommandLineRunner {	

public static void main(String args[]){
		SpringApplication.run(App.class, args);
}

@Autowired
JdbcTemplate jdbcTemplate;

public void run(String...strings){
	System.out.println("In Application run...");
	String sql = "INSERT INTO profiles (profile_id, first_name, last_name, email) "+
	"VALUES (uuid_generate_v4(), ?, ?, ?)";
	jdbcTemplate.update(sql);
}
}
