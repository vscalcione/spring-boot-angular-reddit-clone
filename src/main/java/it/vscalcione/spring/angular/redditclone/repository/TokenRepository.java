package it.vscalcione.spring.angular.redditclone.repository;

import it.vscalcione.spring.angular.redditclone.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<VerificationToken, Long> {
}