package it.vscalcione.spring.angular.redditclone.repository;

import it.vscalcione.spring.angular.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
}
