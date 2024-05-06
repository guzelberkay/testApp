package com.berkayg.testapp.controller;

import com.berkayg.testapp.dto.response.QuestionFindAllResponseDto;
import com.berkayg.testapp.entity.AnswerChoice;
import com.berkayg.testapp.entity.Question;
import com.berkayg.testapp.service.QuestionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.berkayg.testapp.constant.EndPoints.*;

@RestController
@RequestMapping(QUESTION)
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping(SAVE)
    public ResponseEntity<Question> save(@Valid @RequestBody Question question) {
        return ResponseEntity.ok(questionService.save(question));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Question>> findAll() {
        return ResponseEntity.ok(questionService.findAll());
    }

    // Tüm soruları DTO formatında getirir
    @GetMapping(FIND_ALL_DTO)
    public ResponseEntity<List<QuestionFindAllResponseDto>> findAllDto() {
        return ResponseEntity.ok(questionService.findAllDto());
    }

    // Soru güncelleme
    @PutMapping(PUT_UPDATE_QUESTION)
    public ResponseEntity<Question> update(@RequestBody Question question) {
        return ResponseEntity.ok(questionService.save(question));
    }

    @DeleteMapping(DELETE_QUESTION)
    public ResponseEntity<String> delete(@RequestBody Long id) {
        questionService.deleteById(id);
        return ResponseEntity.ok("Başarıyla soru silindi");
    }

//    public List<AnswerChoice> findAllByQuestionOrderByAnswerChoices(@PathVariable Long id) {
//        return questionService.findAllByQuestionOrderByAnswerChoices(id);
//    }

//
//    @GetMapping("/{questionId}/right-answer-choice")
//    public ResponseEntity<AnswerChoice> findRightAnswerChoiceByQuestionId(@PathVariable Long questionId) {
//        AnswerChoice rightAnswerChoice = questionService.findRightAnswerChoiceByQuestionId(questionId);
//        return ResponseEntity.ok(rightAnswerChoice);
//    }
}