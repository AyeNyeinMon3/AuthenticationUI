package com.example.uidesignthree;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class SignupFragmentDirections {
  private SignupFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSignupFragmentToSignInFragment() {
    return new ActionOnlyNavDirections(R.id.action_signupFragment_to_signInFragment);
  }
}
