package android.bizapps.com.joblocator.views;

import android.bizapps.com.joblocator.R;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by Murali on 1/9/2016.
 */
public class AppliedFrag extends Fragment {

    RecyclerView AppliedRecycler;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View appliedView = inflater.inflate(R.layout.appliedfrag, container, false);
        AppliedRecycler = (RecyclerView) appliedView.findViewById(R.id.appliedrecycler);
        return appliedView;
    }
}
