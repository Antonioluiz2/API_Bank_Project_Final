package br.com.luiz.itexperts.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.luiz.itexperts.enums.TypeCard;
import br.com.luiz.itexperts.models.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {

    boolean existsByNumberAndType_TypeCard(String number, TypeCard type);
}
