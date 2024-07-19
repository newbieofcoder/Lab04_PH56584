package fpoly.account.myapplication.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import fpoly.account.myapplication.R;


public class Fragment4 extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_4, container, false);
        EditText edtSend = view.findViewById(R.id.edtSend);
        TextView tvSend = view.findViewById(R.id.tvSend);
        tvSend.setOnClickListener(v -> {
            String message = edtSend.getText().toString();
            FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
            Fragment3 fragment3 = (Fragment3) fragmentManager.findFragmentById(R.id.fragment_3);
            fragment3.tvReceive.setText(message);
        });
        return view;
    }
}