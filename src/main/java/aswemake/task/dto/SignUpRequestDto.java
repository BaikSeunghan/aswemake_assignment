package aswemake.task.dto;

import aswemake.task.enums.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class SignUpRequestDto {

  @NotBlank(message = "이름을 입력해주세요.")
  private String name;

  @NotBlank(message = "비밀번호를 입력해주세요.")
  private String password;

  @NotNull(message = "역할을 입력해주세요.")
  private UserRole role;

}
