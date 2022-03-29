package br.com.luiz.itexperts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luiz.itexperts.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    boolean existsByAccountCode(String eccountCode);
}
