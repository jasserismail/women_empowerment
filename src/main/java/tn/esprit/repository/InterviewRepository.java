package tn.esprit.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.Entity.Condidat;
import tn.esprit.Entity.Interview;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Long> {
}
