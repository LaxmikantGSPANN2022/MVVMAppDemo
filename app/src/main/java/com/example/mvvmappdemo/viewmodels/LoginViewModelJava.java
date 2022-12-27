package com.example.mvvmappdemo.viewmodels;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mvvmappdemo.BR;
import com.example.mvvmappdemo.model.UserJava;

public class LoginViewModelJava extends BaseObservable {

    private UserJava userJava;
    private String successMessage = "Login was successful";
    private String errorMessage = "Email or Password not valid";

    @Bindable
    String toastMessage = null;

    public String getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    @Bindable
    public String getUserEmail() {
        return userJava.getUserEmail();
    }

    @Bindable
    public String getUserPassword() {
        return userJava.getUserPassword();
    }

    public void setUserEmail(String email) {
        userJava.setUserEmail(email);
        notifyPropertyChanged(BR.userEmail);
    }

    public void setUserPassword(String password) {
        userJava.setUserPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }

    public LoginViewModelJava(){
        userJava = new UserJava("","");
    }

    public void onLoginClicked(){
        if (isInputDataValid()){
            setToastMessage(successMessage);
        } else {
            setToastMessage(errorMessage);
        }
    }

    private boolean isInputDataValid() {
        return (!TextUtils.isEmpty(getUserEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() &&
                getUserPassword().length() > 5);
    }
}
