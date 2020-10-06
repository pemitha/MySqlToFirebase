package lk.epic.dbbackup.Dbbackup.repo;

import lk.epic.dbbackup.Dbbackup.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<ProductImage,Long> {
}
