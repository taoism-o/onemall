package cn.iocoder.mall.user.service.api.dto;

import java.io.Serializable;

public class OAuth2AuthenticationDTO implements Serializable {

    /**
     * 用户编号
     */
    private Long uid;

    public Long getUid() {
        return uid;
    }

    public OAuth2AuthenticationDTO setUid(Long uid) {
        this.uid = uid;
        return this;
    }

}