package com.berkayg.testapp.repository;


import com.berkayg.testapp.entity.AnswerChoice;
import com.berkayg.testapp.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

   // List<AnswerChoice> findAllByQuestionOrderByAnswerChoices(Long id);

}





