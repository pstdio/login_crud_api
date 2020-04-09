package eu.pstdio.login_crud_api.presentation.controller;

/**
 *
 * @author mib
 */
public interface LoginController {
    String post(String json);
    String get(String json);
    void put(String json);
    void delete(String json);
}
