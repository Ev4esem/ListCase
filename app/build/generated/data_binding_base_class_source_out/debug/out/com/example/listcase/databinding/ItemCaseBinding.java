// Generated by view binder compiler. Do not edit!
package com.example.listcase.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.listcase.R;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCaseBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageButton btnDelete;

  @NonNull
  public final MaterialCheckBox checkBox;

  @NonNull
  public final ImageButton imDesc;

  @NonNull
  public final TextView tvData;

  @NonNull
  public final TextView tvNameCase;

  private ItemCaseBinding(@NonNull CardView rootView, @NonNull ImageButton btnDelete,
      @NonNull MaterialCheckBox checkBox, @NonNull ImageButton imDesc, @NonNull TextView tvData,
      @NonNull TextView tvNameCase) {
    this.rootView = rootView;
    this.btnDelete = btnDelete;
    this.checkBox = checkBox;
    this.imDesc = imDesc;
    this.tvData = tvData;
    this.tvNameCase = tvNameCase;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_case, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCaseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnDelete;
      ImageButton btnDelete = ViewBindings.findChildViewById(rootView, id);
      if (btnDelete == null) {
        break missingId;
      }

      id = R.id.checkBox;
      MaterialCheckBox checkBox = ViewBindings.findChildViewById(rootView, id);
      if (checkBox == null) {
        break missingId;
      }

      id = R.id.imDesc;
      ImageButton imDesc = ViewBindings.findChildViewById(rootView, id);
      if (imDesc == null) {
        break missingId;
      }

      id = R.id.tvData;
      TextView tvData = ViewBindings.findChildViewById(rootView, id);
      if (tvData == null) {
        break missingId;
      }

      id = R.id.tv_name_case;
      TextView tvNameCase = ViewBindings.findChildViewById(rootView, id);
      if (tvNameCase == null) {
        break missingId;
      }

      return new ItemCaseBinding((CardView) rootView, btnDelete, checkBox, imDesc, tvData,
          tvNameCase);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}