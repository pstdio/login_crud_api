package eu.pstdio.login_creator_api.integration.dao;

import eu.pstdio.login_creator_api.integration.entity.LoginEntity;

/**
 *
 * @author mib
 */
public interface LoginDao {
    void create(LoginEntity loginEntity);
    LoginEntity getById(Long id);
    void deleteById(Long id);
}
