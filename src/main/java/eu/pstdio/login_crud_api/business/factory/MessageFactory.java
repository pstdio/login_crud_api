package eu.pstdio.login_crud_api.business.factory;

/**
 *
 * @author mib
 */
public interface MessageFactory {
    <T> T create(String message, Class clazz);
}
