package com.example.cleanarchme.views.login

import com.example.cleanarchme.views.BasePresenter

interface ContractLogin {

    interface ContractLoginView {
        fun getUser(): String
        fun getPassword(): String
        fun setUser(user: String)
        fun setPassword(pass: String)
        fun isEnableFingerPrint(): Boolean
        fun emptyFields()
        fun errorFingerPrint()
        fun setupFingerPrint(visibility: Boolean, check: Boolean)

        fun nextActivity()
        fun loginError()
        fun errorBiometric(errString: String)
        fun loginBiometrics()
    }

    interface ContractPresenter : BasePresenter<ContractLoginView> {
        fun onLoginClick()
        fun onEnableFingerPrintClick()
        fun biometricError(errString: String)
        fun biometricSuccess()
        fun biometricFailed()
        fun onLogin()
    }

}