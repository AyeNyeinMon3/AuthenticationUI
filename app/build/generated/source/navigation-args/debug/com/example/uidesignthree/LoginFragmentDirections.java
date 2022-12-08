package com.example.uidesignthree;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSignupFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_signupFragment);
  }

  @NonNull
  public static NavDirections actionLoginFragmentToSignInFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_signInFragment);
  }
}
