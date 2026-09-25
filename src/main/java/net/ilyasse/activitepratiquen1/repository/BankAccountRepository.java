package net.ilyasse.activitepratiquen1.repository;

import net.ilyasse.activitepratiquen1.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, UUID> {
}
