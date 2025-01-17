package com.example.ashutosh.music_player;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashutosh on 10/2/17.
 */

public class RegisterRequest extends StringRequest
{
    private static final String REGISTER_REQUEST_URL = "http://ashuthesmartest.000webhostapp.com/register.php" ;
    private Map<String,String> params ;

    public RegisterRequest(String email, String username, String password, String phone, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null) ;
        params = new HashMap<>() ;
        params.put("email", email ) ;
        params.put("username", username ) ;
        params.put("password", password ) ;
        params.put("phone", phone ) ;
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
