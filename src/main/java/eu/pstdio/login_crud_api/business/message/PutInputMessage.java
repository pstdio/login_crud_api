package eu.pstdio.login_crud_api.business.message;

/**
 *
 * @author mib
 */
public interface PutInputMessage {
    void setId(String id);
    String getId();
    void setPasswd(String passwd);
    String getPasswd();
    void setDisabled(String disabled);
    String getDisabled();
}
