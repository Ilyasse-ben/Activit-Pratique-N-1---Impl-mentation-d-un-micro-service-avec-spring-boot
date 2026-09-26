package net.ilyasse.activitepratiquen1.service;

import net.ilyasse.activitepratiquen1.dto.AccountRequestdTO;
import net.ilyasse.activitepratiquen1.dto.AccountResponseDto;

public interface BankAccountService {
    public AccountResponseDto addAccount(AccountRequestdTO accountRequestdTO);
}
