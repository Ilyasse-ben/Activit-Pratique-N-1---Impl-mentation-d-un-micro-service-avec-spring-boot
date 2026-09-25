package net.ilyasse.activitepratiquen1.repository;

import net.ilyasse.activitepratiquen1.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BankAccountRepository extends JpaRepository<BankAccount, UUID> {
}
