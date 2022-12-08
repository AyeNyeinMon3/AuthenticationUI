package com.example.uidesignthree;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class SignInFragmentDirections {
  private SignInFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSignInFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_signInFragment_to_loginFragment);
  }
}
