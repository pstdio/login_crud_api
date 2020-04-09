package eu.pstdio.login_crud_api.presentation.controller;

/**
 *
 * @author mib
 */
public interface LoginController {
    String post(String json);
    String get(String json);
    String put(String json);
    String delete(String json);
}
