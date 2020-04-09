package eu.pstdio.login_crud_api.integration.entity;

/**
 *
 * @author mib
 */
public interface LoginEntity {
    void setId(Long id);
    Long getId();
    void setHashedPasswd(String hashedPasswd);
    String getHashedPasswd();
    void setSalt(String salt);
    String getSalt();
    void setDisabled(boolean disabled);
    boolean isDisabled();
}
