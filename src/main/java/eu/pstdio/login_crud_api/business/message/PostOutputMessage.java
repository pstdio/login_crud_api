package eu.pstdio.login_crud_api.business.message;

/**
 *
 * @author mib
 */
public interface PostOutputMessage {
    void setCreated(boolean created);
    boolean isCreated();
    void setLoginId(Long loginId);
    Long getLoginId();
}
