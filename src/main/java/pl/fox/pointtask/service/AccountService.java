package pl.fox.pointtask.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.fox.pointtask.model.Account;
import pl.fox.pointtask.repository.AccountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    private static final Logger LOG = LoggerFactory.getLogger(AccountService.class);

    private final AccountRepository repository;

    @Autowired
    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public void saveAccount(Account a){
        repository.save(a);
        LOG.info("Saved {}", a.toString());
    }

    public Optional<Account> findById(Long id){
        return repository.findById(id);
    }

    public List<Account> findAll(){
        return repository.findAll();
    }

    public void delete(Account a){
        repository.delete(a);
    }

}
