package com.example.uidesignthree;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_loginFragment);
  }
}
