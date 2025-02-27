// Generated by view binder compiler. Do not edit!
package com.my.mdmd.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.my.mdmd.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAboutBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView aboutAppname;

  @NonNull
  public final TextView aboutCredits;

  @NonNull
  public final TextView aboutGithub;

  @NonNull
  public final TextView aboutVersion;

  @NonNull
  public final ImageView imageView;

  private ActivityAboutBinding(@NonNull FrameLayout rootView, @NonNull TextView aboutAppname,
      @NonNull TextView aboutCredits, @NonNull TextView aboutGithub, @NonNull TextView aboutVersion,
      @NonNull ImageView imageView) {
    this.rootView = rootView;
    this.aboutAppname = aboutAppname;
    this.aboutCredits = aboutCredits;
    this.aboutGithub = aboutGithub;
    this.aboutVersion = aboutVersion;
    this.imageView = imageView;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAboutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_about, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAboutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_appname;
      TextView aboutAppname = ViewBindings.findChildViewById(rootView, id);
      if (aboutAppname == null) {
        break missingId;
      }

      id = R.id.about_credits;
      TextView aboutCredits = ViewBindings.findChildViewById(rootView, id);
      if (aboutCredits == null) {
        break missingId;
      }

      id = R.id.about_github;
      TextView aboutGithub = ViewBindings.findChildViewById(rootView, id);
      if (aboutGithub == null) {
        break missingId;
      }

      id = R.id.about_version;
      TextView aboutVersion = ViewBindings.findChildViewById(rootView, id);
      if (aboutVersion == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      return new ActivityAboutBinding((FrameLayout) rootView, aboutAppname, aboutCredits,
          aboutGithub, aboutVersion, imageView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
