package lk.epic.dbbackup.Dbbackup;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
@EnableJpaRepositories
public class DbbackupApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DbbackupApplication.class, args);
		uploadtoFirebase();

	}

	public static void uploadtoFirebase() throws IOException {

		FileInputStream serviceAccount =
				new FileInputStream("D:\\Projects\\Dbbackup\\src\\main\\java\\lk\\epic\\dbbackup\\Dbbackup\\urgentagent-c80ee-firebase-adminsdk-an2sw-726bd9a454.json");

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(GoogleCredentials.fromStream(serviceAccount))
				.setDatabaseUrl("https://urgentagent-c80ee.firebaseio.com")
				.build();

		FirebaseApp.initializeApp(options);

	}
}
