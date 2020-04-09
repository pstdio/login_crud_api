package eu.pstdio.login_creator_api.business.message;

/**
 *
 * @author mib
 */
public interface PutInputMessage {
    void setId(Long id);
    Long getId();
    void setPasswd(String passwd);
    String getPasswd();
    void setDisabled(String disabled);
    String getDisabled();
}
