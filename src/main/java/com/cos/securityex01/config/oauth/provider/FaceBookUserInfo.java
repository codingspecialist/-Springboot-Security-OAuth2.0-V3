package com.cos.securityex01.config.oauth.provider;

import java.util.Map;

public class FaceBookUserInfo implements OAuth2UserInfo{

	private Map<String, Object> attributes;
	
    public FaceBookUserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }
	
    @Override
    public String getProviderId() {
        return (String) attributes.get("id");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }

    @Override
    public String getEmail() {
        return (String) attributes.get("email");
    }

	@Override
	public String getProvider() {
		return "facebook";
	}
}
