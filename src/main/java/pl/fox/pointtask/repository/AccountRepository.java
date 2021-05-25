package pl.fox.pointtask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.fox.pointtask.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
