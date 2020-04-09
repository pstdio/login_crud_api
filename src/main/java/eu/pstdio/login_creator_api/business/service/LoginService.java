package eu.pstdio.login_creator_api.business.service;

/**
 *
 * @author mib
 */
public interface LoginService {
    String post(String json);
    String get(String json);
    String put(String json);
    String delete(String json);
}
