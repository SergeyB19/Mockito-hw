package pro.sky.java.course2.mockitohw.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Сотрудник не найден")
public class EmployeeNotFoundException extends RuntimeException{
}
