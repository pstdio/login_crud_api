package eu.pstdio.login_crud_api.business.service;

/**
 *
 * @author mib
 */
public interface LoginService {
    String post(String json);
    String get(String json);
    void put(String json);
    void delete(String json);
}
