package aswemake.task.dto;

import aswemake.task.enums.UserRole;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
public class LoginRequestDto {

  @NotBlank(message = "이름을 입력해주세요.")
  private String name;

  @NotBlank(message = "비밀번호를 입력해주세요.")
  private String password;
}
