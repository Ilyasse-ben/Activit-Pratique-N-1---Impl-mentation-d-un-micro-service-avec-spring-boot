package net.ilyasse.activitepratiquen1;

import net.ilyasse.activitepratiquen1.entity.BankAccount;
import net.ilyasse.activitepratiquen1.entity.enums.AccountType;
import net.ilyasse.activitepratiquen1.repository.BankAccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class ActivitePratiqueN1Application {

    public static void main(String[] args) {
        SpringApplication.run(ActivitePratiqueN1Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(BankAccountRepository bankAccountRepository){
        return args -> {
            for(int i=0; i<10; i++){
                BankAccount bankAccount= BankAccount.builder()
                        .id(UUID.randomUUID())
                        .type(Math.random()>0.5? AccountType.CURRENT_ACCOUNT:AccountType.SAVING_ACCOUNT)
                        .balance(1000+Math.random()*100)
                        .createdAt(new Date())
                        .currency("MAD")
                        .build();
                bankAccountRepository.save(bankAccount);
            }

        };
    }

}
