package in.ashokit.service;
import in.ashokit.response.*;
import in.ashokit.request.LoginRequest;
import in.ashokit.request.PwdChangeRequest;
import in.ashokit.request.SignUpRequest;
import in.ashokit.response.LoginResponse;

public interface UserService {

	public SignUpResponse saveUser(SignUpRequest request);
	public LoginResponse userLogin(LoginRequest request);
	public LoginResponse updatePwd(PwdChangeRequest request);
	public boolean recoverPwd(String email);
}
