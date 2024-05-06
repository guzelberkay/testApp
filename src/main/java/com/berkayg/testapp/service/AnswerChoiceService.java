package com.berkayg.testapp.service;

import com.berkayg.testapp.dto.response.AnswerChoiceFindAllDto;
import com.berkayg.testapp.dto.response.QuestionFindAllResponseDto;
import com.berkayg.testapp.entity.AnswerChoice;
import com.berkayg.testapp.mapper.AnswerChoiceMapper;
import com.berkayg.testapp.mapper.QuestionMapper;
import com.berkayg.testapp.repository.AnswerChoiceRepository;
import com.berkayg.testapp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AnswerChoiceService extends ServiceManager<AnswerChoice, Long> {
    private final AnswerChoiceRepository answerChoiceRepository;
    public AnswerChoiceService(AnswerChoiceRepository answerChoiceRepository) {
        super(answerChoiceRepository);
        this.answerChoiceRepository = answerChoiceRepository;
    }
    // Soru id sine göre cevap şıklarını getirir
    public List<AnswerChoice> findAllByQuestion_Id(Long questionId) {
        return answerChoiceRepository.findAllByQuestion_Id(questionId);
    }

    public List<AnswerChoiceFindAllDto> findAllDto() {
        List<AnswerChoiceFindAllDto> answerChoiceFindAllDtos = new ArrayList<>();
        answerChoiceRepository.findAll().forEach(answerChoice -> answerChoiceFindAllDtos.add(AnswerChoiceMapper.INSTANCE.answerChoiceToAnswerChoiceFindAllDto(answerChoice)));
        return answerChoiceFindAllDtos;
    }

}


