package com.jeecg.p3.system.entity;

import java.util.Date;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>JwSystemUser:运营用户表; InnoDB free: 9216 kB<br>
 * @author junfeng.zhou
 * @since：2015年12月21日 10时28分29秒 星期一 
 * @version:1.0
 */
public class JwSystemUser implements Entity<Long> {
	private static final long serialVersionUID = 1L;
	
	/**
	 *密码
	 */
	private String password;
	/**
	 * openid
	 */
	private String openid;
	//update--begin--author: gj_shaojc--date:20180503--------for:增加代理商管理-
	/**
	 * 代理商id
	 */
	private String agentId;
	private String relName;
	public String getRelName() {
		return relName;
	}
	public void setRelName(String relName) {
		this.relName = relName;
	}
	public String getRelPhone() {
		return relPhone;
	}
	public void setRelPhone(String relPhone) {
		this.relPhone = relPhone;
	}
	private String relPhone;
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	//update--end--author: gj_shaojc--date:20180503--------for:增加代理商管理-
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public Long getId() {
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JwSystemUser [id=");
		builder.append(id);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", userErpNo=");
		builder.append(userErpNo);
		builder.append(", userTyp=");
		builder.append(userTyp);
		builder.append(", opeDepId=");
		builder.append(opeDepId);
		builder.append(", opePhoneNum=");
		builder.append(opePhoneNum);
		builder.append(", email=");
		builder.append(email);
		builder.append(", opeEmailAuthinfo=");
		builder.append(opeEmailAuthinfo);
		builder.append(", userIcon=");
		builder.append(userIcon);
		builder.append(", opeMobileAuthInd=");
		builder.append(opeMobileAuthInd);
		builder.append(", opeEmailAuthInd=");
		builder.append(opeEmailAuthInd);
		builder.append(", idNum=");
		builder.append(idNum);
		builder.append(", idTyp=");
		builder.append(idTyp);
		builder.append(", state=");
		builder.append(state);
		builder.append(", userStat=");
		builder.append(userStat);
		builder.append(", lastLognDttm=");
		builder.append(lastLognDttm);
		builder.append(", lastLognIp=");
		builder.append(lastLognIp);
		builder.append(", opePasswdInd=");
		builder.append(opePasswdInd);
		builder.append(", delStat=");
		builder.append(delStat);
		builder.append(", creator=");
		builder.append(creator);
		builder.append(", editor=");
		builder.append(editor);
		builder.append(", createDt=");
		builder.append(createDt);
		builder.append(", editDt=");
		builder.append(editDt);
		builder.append(", lastEditDt=");
		builder.append(lastEditDt);
		builder.append(", recordVersion=");
		builder.append(recordVersion);
		builder.append(", openid=");
		builder.append(openid);
		builder.append("]");
		return builder.toString();
	}
	
}
