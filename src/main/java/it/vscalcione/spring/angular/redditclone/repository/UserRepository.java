package it.vscalcione.spring.angular.redditclone.repository;

import it.vscalcione.spring.angular.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
