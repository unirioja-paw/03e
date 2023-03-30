package es.unirioja.session;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String login;
    private String displayName;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

}
