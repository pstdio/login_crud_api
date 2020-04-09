package eu.pstdio.login_creator_api.business.factory;

import eu.pstdio.login_creator_api.integration.entity.LoginEntity;
import eu.pstdio.login_creator_api.business.message.PostInputMessage;

/**
 *
 * @author mib
 */
public interface LoginFactory {
    LoginEntity create(PostInputMessage credentials);
}
