package com.stackroute.eventmanagement.authentication.JwtConfig;

import com.stackroute.eventmanagement.authentication.model.UserModel;
import java.util.Map;

public interface SecurityTokenGenerator {

    Map<String,String> generateToken(UserModel user);
}
