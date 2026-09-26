package net.ilyasse.activitepratiquen1.service;

import net.ilyasse.activitepratiquen1.dto.AccountRequestdTO;
import net.ilyasse.activitepratiquen1.dto.AccountResponseDto;
import net.ilyasse.activitepratiquen1.entity.BankAccount;
import net.ilyasse.activitepratiquen1.mapper.AccountMapper;
import net.ilyasse.activitepratiquen1.repository.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class BankAccountServiceImp implements BankAccountService{
    @Autowired
    AccountMapper accountMapper;
    @Autowired
    BankAccountRepository bankAccountRepository;
    @Override
    public AccountResponseDto addAccount(AccountRequestdTO accountRequestdTO) {
        BankAccount bankAccount=accountMapper.toBankAccount(accountRequestdTO);
        bankAccountRepository.save(bankAccount);
        return accountMapper.toAccountResponseDto(bankAccount);
    }
}
