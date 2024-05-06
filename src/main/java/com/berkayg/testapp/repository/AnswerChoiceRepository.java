package com.berkayg.testapp.repository;

import com.berkayg.testapp.entity.AnswerChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerChoiceRepository extends JpaRepository<AnswerChoice, Long> {
    List<AnswerChoice> findAllByQuestion_Id(Long questionId);
}

