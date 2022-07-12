package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter @Setter
public class SubjectDTO {

    @NotNull(message = "O nome do assunto não pode ser nulo.")
    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ/s]+", message = "O nome do assunto deve começar com letra maiúscula.")
    @Size(min = 1, max = 30,message = "O comprimento do assunto não pode exceder 30 caracteres")
    String name;

    @NotBlank(message = "A nota não pode estar vazia.")
    @DecimalMin(value = "0.0", message = "A nota mínima é 0,0")
    @DecimalMax(value = "10.0", message = "A nota máxima é 0,0")
    Double score;
}
