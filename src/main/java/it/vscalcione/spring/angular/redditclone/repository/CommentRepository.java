package it.vscalcione.spring.angular.redditclone.repository;

import it.vscalcione.spring.angular.redditclone.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
