package com.berkayg.testapp.controller;

import com.berkayg.testapp.dto.response.AnswerChoiceFindAllDto;
import com.berkayg.testapp.dto.response.QuestionFindAllResponseDto;
import com.berkayg.testapp.entity.AnswerChoice;

import com.berkayg.testapp.service.AnswerChoiceService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.berkayg.testapp.constant.EndPoints.*;

@RestController
@RequestMapping(ANSWERCHOICE)
@RequiredArgsConstructor
public class AnswerChoiceController {

    private final AnswerChoiceService answerChoiceService;

    @PostMapping(SAVE)
    public ResponseEntity<AnswerChoice> save(@Valid @RequestBody AnswerChoice answerChoice) {
        return ResponseEntity.ok(answerChoiceService.save(answerChoice));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<AnswerChoice>> findAll() {
        return ResponseEntity.ok(answerChoiceService.findAll());
    }

    @PutMapping(PUT_UPDATE_ANSWERCHOICE)
    public ResponseEntity<AnswerChoice> update(@RequestBody AnswerChoice answerChoice) {
        return ResponseEntity.ok(answerChoiceService.save(answerChoice));
    }

    @DeleteMapping(DELETE_CORRECTANSWER)
    public ResponseEntity<String> delete(@PathVariable Long id) {
        answerChoiceService.deleteById(id);
        return ResponseEntity.ok("Başarıyla cevap şıkkı silindi");
    }

    @GetMapping(FIND_ALL_DTO)
    public ResponseEntity<List<AnswerChoiceFindAllDto>> findAllDto() {
        return ResponseEntity.ok(answerChoiceService.findAllDto());
    }

}
