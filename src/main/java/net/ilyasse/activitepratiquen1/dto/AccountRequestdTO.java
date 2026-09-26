package net.ilyasse.activitepratiquen1.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ilyasse.activitepratiquen1.entity.enums.AccountType;

import java.util.Date;
import java.util.UUID;
@Data @NoArgsConstructor @AllArgsConstructor
public class AccountRequestdTO {

    private Double balance;
    private String currency;
    private AccountType type;
}
