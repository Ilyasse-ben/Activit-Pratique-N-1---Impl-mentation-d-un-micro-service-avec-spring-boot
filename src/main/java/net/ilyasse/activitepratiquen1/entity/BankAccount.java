package net.ilyasse.activitepratiquen1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;
import net.ilyasse.activitepratiquen1.entity.enums.AccountType;
import org.hibernate.internal.build.AllowNonPortable;

import java.util.Date;
import java.util.UUID;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BankAccount {
    @Id
    private UUID id;
    private Date createdAt;
    private double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
}
