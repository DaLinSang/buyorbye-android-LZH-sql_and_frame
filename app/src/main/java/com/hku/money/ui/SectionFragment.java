package com.hku.money.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.hku.money.R;

public class SectionFragment extends Fragment {
    public SectionFragment() {
        super(R.layout.fragment_section);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView title = view.findViewById(R.id.section_title);
        title.setText(getArguments() != null ? getArguments().getString("title") : "buy or bye");
    }
}
