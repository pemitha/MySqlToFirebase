package lk.epic.dbbackup.Dbbackup;


import com.google.firebase.cloud.FirestoreClient;
import lk.epic.dbbackup.Dbbackup.entity.AppVersion;
import lk.epic.dbbackup.Dbbackup.entity.Category;
import lk.epic.dbbackup.Dbbackup.entity.Product;
import lk.epic.dbbackup.Dbbackup.entity.User;
import lk.epic.dbbackup.Dbbackup.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBcontroller {


      @Autowired
      UserRepository users;

      @GetMapping("/getUsers")
     public String getUsers(){
          users.findAll().forEach(u -> {
              FirestoreClient.getFirestore().collection("product_image").add(u);
          });

          return "Success";
      }

}
