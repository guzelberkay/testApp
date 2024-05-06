package com.berkayg.testapp.mapper;

import com.berkayg.testapp.dto.response.AnswerChoiceFindAllDto;
import com.berkayg.testapp.dto.response.QuestionFindAllResponseDto;
import com.berkayg.testapp.entity.AnswerChoice;
import com.berkayg.testapp.entity.Question;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AnswerChoiceMapper {

    AnswerChoiceMapper INSTANCE = Mappers.getMapper(AnswerChoiceMapper.class);

    AnswerChoiceFindAllDto answerChoiceToAnswerChoiceFindAllDto( AnswerChoice answerChoice);
}
