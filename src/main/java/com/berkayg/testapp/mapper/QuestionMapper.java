package com.berkayg.testapp.mapper;

import com.berkayg.testapp.dto.response.QuestionFindAllResponseDto;
import com.berkayg.testapp.entity.Question;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface QuestionMapper {
    QuestionMapper INSTANCE = Mappers.getMapper(QuestionMapper.class);

    QuestionFindAllResponseDto questionToQuestionFindAllResponseDto(Question question);


}
