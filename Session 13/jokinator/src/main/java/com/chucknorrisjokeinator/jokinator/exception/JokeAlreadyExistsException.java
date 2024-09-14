package com.chucknorrisjokeinator.jokinator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.IM_USED, reason ="Joke already exists")
public class JokeAlreadyExistsException extends RuntimeException{
}
