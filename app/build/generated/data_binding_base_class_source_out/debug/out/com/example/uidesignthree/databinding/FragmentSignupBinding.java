// Generated by view binder compiler. Do not edit!
package com.example.uidesignthree.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.uidesignthree.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnSignup;

  @NonNull
  public final EditText editEmail;

  @NonNull
  public final EditText editName;

  @NonNull
  public final EditText editPsw;

  @NonNull
  public final ImageView imageView7;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final LinearLayout linearLayout;

  private FragmentSignupBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnSignup, @NonNull EditText editEmail, @NonNull EditText editName,
      @NonNull EditText editPsw, @NonNull ImageView imageView7, @NonNull ImageView imageView8,
      @NonNull LinearLayout linearLayout) {
    this.rootView = rootView;
    this.btnSignup = btnSignup;
    this.editEmail = editEmail;
    this.editName = editName;
    this.editPsw = editPsw;
    this.imageView7 = imageView7;
    this.imageView8 = imageView8;
    this.linearLayout = linearLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_signup;
      AppCompatButton btnSignup = ViewBindings.findChildViewById(rootView, id);
      if (btnSignup == null) {
        break missingId;
      }

      id = R.id.edit_email;
      EditText editEmail = ViewBindings.findChildViewById(rootView, id);
      if (editEmail == null) {
        break missingId;
      }

      id = R.id.edit_name;
      EditText editName = ViewBindings.findChildViewById(rootView, id);
      if (editName == null) {
        break missingId;
      }

      id = R.id.edit_psw;
      EditText editPsw = ViewBindings.findChildViewById(rootView, id);
      if (editPsw == null) {
        break missingId;
      }

      id = R.id.imageView7;
      ImageView imageView7 = ViewBindings.findChildViewById(rootView, id);
      if (imageView7 == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      return new FragmentSignupBinding((ConstraintLayout) rootView, btnSignup, editEmail, editName,
          editPsw, imageView7, imageView8, linearLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
