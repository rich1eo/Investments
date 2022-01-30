package ru.gpb.javacourse.Investments.aplication.service.information;

import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.aplication.Exception.errorType;
import ru.gpb.javacourse.Investments.aplication.autorization.Autorization;
import ru.gpb.javacourse.Investments.aplication.autorization.ClientAutorization;
import ru.gpb.javacourse.Investments.infastructure.dao.AppealDAO;

@Service
public class CheckBalance {
    AppealDAO appealDAO;
    Autorization autorization;

    public CheckBalance(AppealDAO appealDAO, Autorization autorization) {
        this.appealDAO = appealDAO;
        this.autorization = autorization;
    }

    public Autorization checkBalance(ClientAutorization clientAutorization) {
        if (appealDAO.checkBalance(clientAutorization.getLogin(), clientAutorization.getPassword())) {
            successfulAuthorizationScenario(clientAutorization.getId());
            return autorization;
        }
        return authorizationFailed();
    }

    public void successfulAuthorizationScenario(int id) {
        autorization.setBalance(appealDAO.getMoney(id));
        autorization.setStatus(errorType.AUTHORIZATION_WAS_SUCCESSFUL.getMessage());
    }

    public Autorization authorizationFailed() {
        autorization.setStatus(errorType.ERROR_AUTORIZATION.getMessage());
        return autorization;
    }
}
