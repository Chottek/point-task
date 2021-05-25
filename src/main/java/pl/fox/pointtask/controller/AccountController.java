package pl.fox.pointtask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.fox.pointtask.model.Account;
import pl.fox.pointtask.service.AccountService;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    private final AccountService service;

    @Autowired
    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping
    public List<Account> getAll(){
        return service.findAll();
    }

    @PostMapping
    public void create(@RequestBody Account account){
        service.saveAccount(account);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable("id") Long id){
        Optional<Account> account = service.findById(id);
        if (account.isPresent()) {
            System.out.println("I should delete: "+ id);
            service.delete(account.get());
            return ResponseEntity.accepted().build();
        } else
            return ResponseEntity.notFound().build();
    }





}
