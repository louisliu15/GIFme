package beans;
// Generated Nov 7, 2016 2:03:08 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * AdminAccountFrozenLog generated by hbm2java
 */
public class AdminAccountFrozenLog  implements java.io.Serializable {


     private int adaFrozenUserId;
     private Admin admin;
     private UserInfo userInfo;
     private Date adaFrozenTime;
     private String adaFrozenMsg;
     private Date acaActivatedTime;

    public AdminAccountFrozenLog() {
    }

	
    public AdminAccountFrozenLog(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    public AdminAccountFrozenLog(Admin admin, UserInfo userInfo, Date adaFrozenTime, String adaFrozenMsg, Date acaActivatedTime) {
       this.admin = admin;
       this.userInfo = userInfo;
       this.adaFrozenTime = adaFrozenTime;
       this.adaFrozenMsg = adaFrozenMsg;
       this.acaActivatedTime = acaActivatedTime;
    }
   
    public int getAdaFrozenUserId() {
        return this.adaFrozenUserId;
    }
    
    public void setAdaFrozenUserId(int adaFrozenUserId) {
        this.adaFrozenUserId = adaFrozenUserId;
    }
    public Admin getAdmin() {
        return this.admin;
    }
    
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public UserInfo getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    public Date getAdaFrozenTime() {
        return this.adaFrozenTime;
    }
    
    public void setAdaFrozenTime(Date adaFrozenTime) {
        this.adaFrozenTime = adaFrozenTime;
    }
    public String getAdaFrozenMsg() {
        return this.adaFrozenMsg;
    }
    
    public void setAdaFrozenMsg(String adaFrozenMsg) {
        this.adaFrozenMsg = adaFrozenMsg;
    }
    public Date getAcaActivatedTime() {
        return this.acaActivatedTime;
    }
    
    public void setAcaActivatedTime(Date acaActivatedTime) {
        this.acaActivatedTime = acaActivatedTime;
    }




}


