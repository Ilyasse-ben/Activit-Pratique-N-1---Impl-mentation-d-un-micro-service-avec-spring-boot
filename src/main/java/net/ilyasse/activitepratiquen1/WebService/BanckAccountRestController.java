package net.ilyasse.activitepratiquen1.WebService;

import net.ilyasse.activitepratiquen1.entity.BankAccount;
import net.ilyasse.activitepratiquen1.repository.BankAccountRepository;
import org.aspectj.lang.annotation.DeclareError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("BankAccoutRestController")
public class BanckAccountRestController {
    @Autowired
    BankAccountRepository bankAccountRepository;
    @GetMapping("/api")
    public List<BankAccount> bankAccounts(){
        return bankAccountRepository.findAll();
    }
    @GetMapping("/BankAccounts/{id}")
    public BankAccount bankAccounts(@PathVariable UUID id){
        return bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException("not find"));
    }
    @PutMapping("/BankAccounts/{id}")
    public BankAccount put(@PathVariable UUID id, @RequestBody BankAccount bankAccount){
        BankAccount account=bankAccountRepository.findById(id).orElseThrow(()-> new RuntimeException("not find"));
        if(bankAccount.getBalance()!=null) account.setBalance(bankAccount.getBalance());
        if(bankAccount.getType()!=null) account.setType(bankAccount.getType());
        if(bankAccount.getCurrency()!=null) account.setCurrency(bankAccount.getCurrency());

        return bankAccountRepository.save(account);
    }
    @PostMapping("/BankAccounts")
    public BankAccount save(@RequestBody BankAccount bankAccount){
        bankAccount.setId(UUID.randomUUID());
        bankAccount.setCreatedAt(new Date());
        return bankAccountRepository.save(bankAccount);
    }
    @DeleteMapping("/BankAccounts/{id}")
    public void delete(@PathVariable UUID id){
         bankAccountRepository.deleteById(id);
    }
}
