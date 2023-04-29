package com.madu.service;

import com.madu.exception.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class ValidatorService {

    public void isEmailValid(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        if (!email.matches(emailRegex)){
            throw new BadRequestException("Email não tem um formato válido");
        }
    }

    public void isCPFValid(String cpf) {
        String cpfRegex = "^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})|(\\d{11})$";

        if (!cpf.matches(cpfRegex)){
            throw new BadRequestException("CPF não tem um formato válido");
        }
    }

    public void isPhoneValid(String phone) {
        String phoneRegex = "^\\(\\d{2}\\)\\s\\d{4,5}-\\d{4}$";

        if (!phone.matches(phoneRegex)){
            throw new BadRequestException("Telefone não tem um formato válido");
        }
    }
}
