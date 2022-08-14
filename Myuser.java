package com.example.myuser;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@AllArgsConstructor
@Data
public class Myuser {
    @NotNull(message = "Id can't be null")
    private String ID;
    @NotEmpty(message = "name can be Empty")
    @Size(min = 3, message = "name must be more than 3 char ")
    private String name;
    @NotNull(message = "age can be Null")
    private Integer age;
    @NotEmpty
    private Boolean onLeave = false;
    @NotNull(message = "employmentYear can't be null")
    private Integer employmentYear;
    @NotNull(message = "annualLeave can't be null")
    private Integer annualLeave;

}
