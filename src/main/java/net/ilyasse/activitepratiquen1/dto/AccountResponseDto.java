package net.ilyasse.activitepratiquen1.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.ilyasse.activitepratiquen1.entity.enums.AccountType;

import java.util.Date;
import java.util.UUID;
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AccountResponseDto {
    private UUID id;
    private Date createdAt;
    private Double balance;
    private String currency;
    private AccountType type;
}
