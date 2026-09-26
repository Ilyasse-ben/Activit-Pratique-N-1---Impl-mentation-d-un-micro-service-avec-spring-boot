package net.ilyasse.activitepratiquen1.mapper;

import lombok.NoArgsConstructor;
import net.ilyasse.activitepratiquen1.dto.AccountRequestdTO;
import net.ilyasse.activitepratiquen1.dto.AccountResponseDto;
import net.ilyasse.activitepratiquen1.entity.BankAccount;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Component
@NoArgsConstructor
public class AccountMapper {
    public BankAccount toBankAccount(AccountRequestdTO accountRequestdTO){
        BankAccount bankAccount=BankAccount.builder()
                .id(UUID.randomUUID())
                .balance(accountRequestdTO.getBalance())
                .createdAt(new Date())
                .type(accountRequestdTO.getType())
                .currency(accountRequestdTO.getCurrency())
                .build();
        return bankAccount;
    }
    public AccountResponseDto toAccountResponseDto(BankAccount bankAccount){
        AccountResponseDto accountResponseDto=AccountResponseDto.builder()
                .id(bankAccount.getId())
                .type(bankAccount.getType())
                .currency(bankAccount.getCurrency())
                .balance(bankAccount.getBalance())
                .createdAt(bankAccount.getCreatedAt())
                .build();
        return accountResponseDto;
    }
}
