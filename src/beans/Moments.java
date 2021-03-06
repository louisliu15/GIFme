package beans;
// Generated Nov 7, 2016 2:03:08 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Moments generated by hbm2java
 */
public class Moments  implements java.io.Serializable {


     private Integer motId;
     private UserInfo userInfo;
     private String motContent;
     private String motGifUri;
     private Date motSentTime;
     private Integer motLikeNum;
     private Integer motCommentNum;
     private Integer motGroupId;
     private Date motVanishTime;
     private Integer motVisable;
     private AdminMomentsReviewLog adminMomentsReviewLog;
     private Set commentses = new HashSet(0);
     private Set likeses = new HashSet(0);

    public Moments() {
    }

    public Moments(UserInfo userInfo, String motContent, String motGifUri, Date motSentTime, Integer motLikeNum, Integer motCommentNum, Integer motGroupId, Date motVanishTime, Integer motVisable, AdminMomentsReviewLog adminMomentsReviewLog, Set commentses, Set likeses) {
       this.userInfo = userInfo;
       this.motContent = motContent;
       this.motGifUri = motGifUri;
       this.motSentTime = motSentTime;
       this.motLikeNum = motLikeNum;
       this.motCommentNum = motCommentNum;
       this.motGroupId = motGroupId;
       this.motVanishTime = motVanishTime;
       this.motVisable = motVisable;
       this.adminMomentsReviewLog = adminMomentsReviewLog;
       this.commentses = commentses;
       this.likeses = likeses;
    }
   
    public Integer getMotId() {
        return this.motId;
    }
    
    public void setMotId(Integer motId) {
        this.motId = motId;
    }
    public UserInfo getUserInfo() {
        return this.userInfo;
    }
    
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    public String getMotContent() {
        return this.motContent;
    }
    
    public void setMotContent(String motContent) {
        this.motContent = motContent;
    }
    public String getMotGifUri() {
        return this.motGifUri;
    }
    
    public void setMotGifUri(String motGifUri) {
        this.motGifUri = motGifUri;
    }
    public Date getMotSentTime() {
        return this.motSentTime;
    }
    
    public void setMotSentTime(Date motSentTime) {
        this.motSentTime = motSentTime;
    }
    public Integer getMotLikeNum() {
        return this.motLikeNum;
    }
    
    public void setMotLikeNum(Integer motLikeNum) {
        this.motLikeNum = motLikeNum;
    }
    public Integer getMotCommentNum() {
        return this.motCommentNum;
    }
    
    public void setMotCommentNum(Integer motCommentNum) {
        this.motCommentNum = motCommentNum;
    }
    public Integer getMotGroupId() {
        return this.motGroupId;
    }
    
    public void setMotGroupId(Integer motGroupId) {
        this.motGroupId = motGroupId;
    }
    public Date getMotVanishTime() {
        return this.motVanishTime;
    }
    
    public void setMotVanishTime(Date motVanishTime) {
        this.motVanishTime = motVanishTime;
    }
    public Integer getMotVisable() {
        return this.motVisable;
    }
    
    public void setMotVisable(Integer motVisable) {
        this.motVisable = motVisable;
    }
    public AdminMomentsReviewLog getAdminMomentsReviewLog() {
        return this.adminMomentsReviewLog;
    }
    
    public void setAdminMomentsReviewLog(AdminMomentsReviewLog adminMomentsReviewLog) {
        this.adminMomentsReviewLog = adminMomentsReviewLog;
    }
    public Set getCommentses() {
        return this.commentses;
    }
    
    public void setCommentses(Set commentses) {
        this.commentses = commentses;
    }
    public Set getLikeses() {
        return this.likeses;
    }
    
    public void setLikeses(Set likeses) {
        this.likeses = likeses;
    }




}


