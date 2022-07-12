package com.meli.obterdiploma.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.valves.rewrite.InternalRewriteMap;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter @Setter
public class StudentDTO {


    @NotBlank(message = "O nome do aluno não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ/s]+", message = "O nome do aluno deve começar com letra maiúscula.")
    @Size(min = 1, max = 50, message = "O comprimento do nome não pode exceder 50 caracteres")
    String studentName;

    String message;
    Double averageScore;

    @NotNull(message = "A lista não pode estar vazia")
    List<SubjectDTO> subjects;
}
