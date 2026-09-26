package net.ilyasse.activitepratiquen1.repository;

import net.ilyasse.activitepratiquen1.entity.BankAccount;
import net.ilyasse.activitepratiquen1.entity.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;
@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, UUID> {
    @RestResource(path = "/ByType")
    List<BankAccount> findByType(@Param("t") AccountType type);
}
