package com.berkayg.testapp.service;

import com.berkayg.testapp.dto.response.QuestionFindAllResponseDto;
import com.berkayg.testapp.entity.AnswerChoice;

import com.berkayg.testapp.entity.Question;
import com.berkayg.testapp.mapper.QuestionMapper;
import com.berkayg.testapp.repository.AnswerChoiceRepository;
import com.berkayg.testapp.repository.QuestionRepository;
import com.berkayg.testapp.utility.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService extends ServiceManager<Question, Long> {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        super(questionRepository);
        this.questionRepository = questionRepository;
    }

    public List<QuestionFindAllResponseDto> findAllDto() {
        List<QuestionFindAllResponseDto> questionFindAllResponseDtos = new ArrayList<>();
        questionRepository.findAll().forEach(question -> questionFindAllResponseDtos.add(QuestionMapper.INSTANCE.questionToQuestionFindAllResponseDto(question)));
        return questionFindAllResponseDtos;
    }
//    // id si verilen soruya ait cevap seçeneklerini döndürür
//    public List<AnswerChoice> findAllByQuestionOrderByAnswerChoices (Long id) {
//        return questionRepository.findAllByQuestionOrderByAnswerChoices(id);
//    }

//    // id si verilen soruya ait doğru cevap seçeneğini döndürür
//    public AnswerChoice findRightAnswerChoiceByQuestionId(Long questionId) {
//        return questionRepository.findRightAnswerChoiceByQuestionId(questionId);
//    }

}